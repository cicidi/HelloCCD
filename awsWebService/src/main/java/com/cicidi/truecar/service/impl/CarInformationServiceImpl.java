package com.cicidi.truecar.service.impl;

import com.cicidi.common.domain.model.Request;
import com.cicidi.common.domain.model.Response;
import com.cicidi.common.domain.model.TrueCarRequest;
import com.cicidi.common.domain.model.TrueCarResponse;
import com.cicidi.truecar.Constants;
import com.cicidi.truecar.model.analysis.CarPriceDetail;
import com.cicidi.truecar.model.database.*;
import com.cicidi.common.vo.TruecarAnalysisViewObject;
import com.cicidi.truecar.service.CarInformationService;
import com.cicidi.truecar.service.impl.io.DataCleaner;
import com.cicidi.truecar.service.impl.io.DataWriter;
import com.cicidi.truecar.util.Util;
import com.cicidi.truecar.webServiceClient.RestClient;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jianming on 4/11/16.
 */
@Component
@Qualifier("carInformationService")
public class CarInformationServiceImpl implements CarInformationService {

    private static final Logger logger = Logger.getLogger(CarInformationServiceImpl.class);
    @Autowired
    RestClient restClient;
    ObjectMapper mapper = new ObjectMapper();

    public List<DataModel> research(Car car) throws Exception {
        DataCleaner dataClean = new DataCleaner();
        String url = Util.getUrl(car);
        String response = restClient.call(url);
        List<DataModel> allModelInfo = new ArrayList<DataModel>();
        List<Trim> trimList = dataClean.getAllTrims(response);
        for (Trim trim : trimList) {
            logger.info("Rest call to " + Constants.website + "/" + trim.getPriceReportUrl());
            String responseToParticalarModel = restClient.call(Constants.website + "/" + trim.getPriceReportUrl());
            logger.info("Loaded" + trim.getName() + " data");
            DataModel dataModelToParticalarModel = dataClean.getCharData(responseToParticalarModel);
            logger.info("processing" + dataModelToParticalarModel.getYearMakeModel() + " " + trim.getName() + " data");
            dataModelToParticalarModel.setCurrent(trim.getName());
            allModelInfo.add(dataModelToParticalarModel);
        }

        logger.info("All trim been load");
        return allModelInfo;

    }

    public File write(String result, Car car) throws IOException {
        DataWriter dataWriter = new DataWriter();
        return dataWriter.writeCarDetail(result, car);

    }

    @Override
    public Response get(Request request) throws Exception {
        Car car = ((TrueCarRequest) request).getCar();
        String zipCode = ((TrueCarRequest) request).getZipCode();
        TrueCarResponse trueCarResponse = new TrueCarResponse();
        List<DataModel> dataModelList = this.research(((TrueCarRequest) request).getCar());
        List<CarPriceDetail> carPriceDetailList = extractData(dataModelList);
        TruecarAnalysisViewObject truecarAnalysisViewObject = calculate(car, carPriceDetailList, zipCode);
        trueCarResponse.setResult(truecarAnalysisViewObject);
        return trueCarResponse;
    }

    public List<CarPriceDetail> extractData(List<DataModel> dataModelList) throws Exception {
        List<CarPriceDetail> carPriceDetailArrayList = new ArrayList<>();
        for (DataModel dataModel : dataModelList) {
            for (ChartData chartData : dataModel.getChartData()) {
                if (chartData.getLocale().equals("national")) {
                    double sum = 0;
                    double totalAccount = 0;
                    double average = 0;
                    double lowest = Double.POSITIVE_INFINITY;
                    for (Bucket bucket : chartData.getHistogram().getBuckets()) {
                        sum += ((bucket.getMinimum() + bucket.getMaximum()) / 2) * bucket.getTransactionCount();
                        totalAccount += bucket.getTransactionCount();
                        if (bucket.getMinimum() < lowest) {
                            lowest = bucket.getMinimum();
                        }
                    }
                    if (chartData.getHistogram().getTotalTransactionCount() != totalAccount) {
                        throw new Exception();
                    }
                    average = sum / totalAccount;
                    CarPriceDetail carPriceDetail = new CarPriceDetail();
                    carPriceDetail.setAverage(average);
                    carPriceDetail.setLowest(lowest);
                    Car car = new Car(dataModel.getYearMakeModel());
                    car.setName(dataModel.getCurrent());
                    carPriceDetail.setCar(car);
                    carPriceDetailArrayList.add(carPriceDetail);
                }

            }
        }
        return carPriceDetailArrayList;
    }

    public TruecarAnalysisViewObject calculate(Car car, List<CarPriceDetail> carPriceDetailList, String zipCode) throws IOException {

        DecimalFormat df = new DecimalFormat("####0");
        String url = restClient.generateURL_TAXAPI_ByPost(zipCode);
        String output = restClient.call(url);
        TaxRate taxRate = mapper.readValue(output, new TypeReference<TaxRate>() {
        });
        TruecarAnalysisViewObject truecarAnalysisViewObject = new TruecarAnalysisViewObject(car);
        for (int i = 0; i < carPriceDetailList.size(); i++) {
            CarPriceDetail current = carPriceDetailList.get(i);
            String currentName = current.getCar().getName();
            for (int j = i + 1; j < carPriceDetailList.size(); j++) {
                CarPriceDetail compared_detail = carPriceDetailList.get(j);
                String compare_Car_Name = compared_detail.getCar().getName();
                Double diff = compared_detail.getAverage() - current.getAverage();
                truecarAnalysisViewObject.addTrimPriceDiff(compare_Car_Name + "-" + currentName, df.format(diff));
//                sb_compare.append(current.getCar().getYearMakeModel() + "," + compare_Car_Name + ",-," + currentName + ",=," + df.format(diff) + "\n");
            }
            double lowestSalePrice = current.getLowest();
            double averageSalePrice = current.getAverage();
            double rate = 0.06;
            if (taxRate != null)
                rate = taxRate.getTotalRate() / 100;
            double lowestOTD = lowestSalePrice * (1 + rate);
            double averageOTD = averageSalePrice * (1 + rate);
            truecarAnalysisViewObject.addLowestSalePrice(currentName, df.format(lowestSalePrice));
            truecarAnalysisViewObject.addAverageSalePrice(currentName, df.format(averageSalePrice));
            truecarAnalysisViewObject.addlowestOTDPrice(currentName, df.format(lowestOTD));
            truecarAnalysisViewObject.addAverageOTDPrice(currentName, df.format(averageOTD));
        }
        return truecarAnalysisViewObject;
    }

}
