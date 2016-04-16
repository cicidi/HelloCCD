//package com.cicidi.truecar.service.impl.io;
//
//import com.cicidi.truecar.Constants;
//import com.cicidi.truecar.model.analysis.CarPriceDetail;
//import com.cicidi.truecar.model.analysis.QuoteHistory;
//import com.cicidi.truecar.model.database.*;
//import com.cicidi.truecar.model.vo.TruecarAnalysisViewObject;
//import com.cicidi.truecar.webServiceClient.TaxRateRestClient;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.text.DecimalFormat;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * List<DataModel> dataModelList
// * Created by wchen00 on 11/14/15.restClient
// */
//public class Calculation {
//    DecimalFormat df = new DecimalFormat("####0");
//    ObjectMapper mapper = new ObjectMapper();
//    TaxRateRestClient restClient = new TaxRateRestClient();
////package com.cicidi.truecar.service.impl.io;
//
//import com.cicidi.truecar.Constants;
//import com.cicidi.truecar.model.analysis.CarPriceDetail;
//import com.cicidi.truecar.model.analysis.QuoteHistory;
//import com.cicidi.truecar.model.database.*;
//import com.cicidi.truecar.model.vo.TruecarAnalysisViewObject;
//import com.cicidi.truecar.webServiceClient.TaxRateRestClient;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.text.DecimalFormat;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * List<DataModel> dataModelList
// * Created by wchen00 on 11/14/15.restClient
// */
//public class Calculation {
//    DecimalFormat df = new DecimalFormat("####0");
//    ObjectMapper mapper = new ObjectMapper();
//    TaxRateRestClient restClient = new TaxRateRestClient();
//
//    public List<CarPriceDetail> getAverage(List<DataModel> dataModelList) throws Exception {
////        TruecarAnalysisViewObject truecarAnalysisViewObject = new TruecarAnalysisViewObject();
//        List<CarPriceDetail> carPriceDetailArrayList = new ArrayList<>();
//        for (DataModel dataModel : dataModelList) {
//            for (ChartData chartData : dataModel.getChartData()) {
//                if (chartData.getLocale().equals("national")) {
//                    double sum = 0;
//                    double totalAccount = 0;
//                    double average = 0;
//                    double lowest = Double.POSITIVE_INFINITY;
//                    for (Bucket bucket : chartData.getHistogram().getBuckets()) {
//                        sum += ((bucket.getMinimum() + bucket.getMaximum()) / 2) * bucket.getTransactionCount();
//                        totalAccount += bucket.getTransactionCount();
//                        if (bucket.getMinimum() < lowest) {
//                            lowest = bucket.getMinimum();
//                        }
//                    }
//                    if (chartData.getHistogram().getTotalTransactionCount() != totalAccount) {
//                        throw new Exception();
//                    }
//                    average = sum / totalAccount;
//                    CarPriceDetail carPriceDetail = new CarPriceDetail();
//                    carPriceDetail.setAverage(average);
//                    carPriceDetail.setLowest(lowest);
//                    Car car = new Car(dataModel.getYearMakeModel());
//                    car.setName(dataModel.getCurrent());
//                    carPriceDetail.setCar(car);
//                    carPriceDetailArrayList.add(carPriceDetail);
//                }
//
//            }
//        }
//        return carPriceDetailArrayList;
//    }
//
//
////    public String compare(List<DataModel> dataModList) throws Exception {
////        List<CarPriceDetail> carPriceDetailList = getAverage(dataModList);
////        return compare(carPriceDetailList, dataModList);
////    }
//
//
//    public QuoteHistory selfUpdatePrice(QuoteHistory quoteHistory) throws Exception {
//        //0     1       2       3       4           5       6       7   8       9       10          11
//        //Year	Make	Model	Trim	PriceType	Fees	Price	OTD	locale	MyPrice	SalesPeson	From
//        if (quoteHistory.getFieldList()[6] != null) {
//
//            String url;
//            TaxRate taxRate = null;
//            if (quoteHistomapperry.getFieldList()[8] != null && !quoteHistory.getFieldList()[8].isEmpty()) {
//                url = restClient.generateURL_TAXAPI_ByPost(quoteHistory.getFieldList()[8]);
//                String output = restClient.call(url);
//                taxRate = mapper.readValue(output, new TypeReference<TaxRate>() {
//                });mapper
//            }
//            double rate = 0.06;
//            if (taxRate != null)
//                rate = taxRate.getTotalRate() / 100;
//            double price_Data = Double.valueOf(quoteHistory.getFieldList()[6]);
//            double base = 0;
//            double fee = 1000;
//            if (quoteHistory.getFieldList()[5] != null && !quoteHistory.getFieldList()[5].isEmpty())
//                fee = Double.valueOf(quoteHistory.getFieldList()[5]);
//            if (quoteHistory.getFieldList()[4].equalsIgnoreCase("OTD")) {
//mapper
//                base = price_Data / (1 + rate) - fee;
//            }
//            if (quoteHistory.getFieldList()[4].equalsIgnoreCase("SalePrice_No_Fee")) {
//                base = price_Data / (1 + rate);
//            }
//            double myPrice = (base + fee) * (1 + Constants.my_tax_rate);
//            quoteHistory.getFieldList()[9] = (String.valueOf(df.format(myPrice)));
//            if (!quoteHistory.getFieldList()[4].equalsIgnoreCase("SalePrice_No_Fee")
//                    && quoteHistory.getFieldList()[4].equalsIgnoreCase("OTD")
//                    && quoteHistory.getFieldList()[4].equalsIgnoreCase("SalePrice_Fee")) {
//                throw new Exception();
//            }
//
//        }
//        return quoteHistory;
//    }
//
//    public void updateQuote() throws Exception {
//        File quoteFile = new File("/Users/wchen00/Desktop/quote.csv");
//        BufferedReader br = null;
//        br = new BufferedReader(new FileReader(quoteFile));
//        StringBuilder sb_part_1 = new StringBuilder();
////        StringBuilder sb_part_2 = new StringBuilder();
//        String line = "";
//        boolean flag_title_1 = false;
//
//        while ((line = br.readLine()) != null) {
//            QuoteHistory quoteHistory;
//            String[] modelList = line.split(",");
//            if (!flag_title_1) {
//                if (modelList[0].equals("Year")) {
//                    flag_title_1 = true;
//                }
//                sb_part_1.append(line.toString());
//                sb_part_1.append("\n");
//            } else {
////                sb_part_2.append(line);
//                quoteHistory = this.selfUpdatePrice(loadRecord(line));
//                for (String field : quoteHistory.getFieldList()) {
//                    sb_part_1.append(field + ",");
//                }
//                sb_part_1.append("\n");
//            }
//
//        }
//        new DataWriter().writeQuote(sb_part_1.toString(), "/Users/wchen00/Desktop/Quote.csv");
//    }
//
//    public static QuoteHistory loadRecord(String line) {
//        String[] items = line.split(",");
//        QuoteHistory quoteHistory = new QuoteHistory();
//        quoteHistory.setFieldList(items);
//        return quoteHistory;
//    }
//
//}

//    public List<CarPriceDetail> getAverage(List<DataModel> dataModelList) throws Exception {
////        TruecarAnalysisViewObject truecarAnalysisViewObject = new TruecarAnalysisViewObject();
//        List<CarPriceDetail> carPriceDetailArrayList = new ArrayList<>();
//        for (DataModel dataModel : dataModelList) {
//            for (ChartData chartData : dataModel.getChartData()) {
//                if (chartData.getLocale().equals("national")) {
//                    double sum = 0;
//                    double totalAccount = 0;
//                    double average = 0;
//                    double lowest = Double.POSITIVE_INFINITY;
//                    for (Bucket bucket : chartData.getHistogram().getBuckets()) {
//                        sum += ((bucket.getMinimum() + bucket.getMaximum()) / 2) * bucket.getTransactionCount();
//                        totalAccount += bucket.getTransactionCount();
//                        if (bucket.getMinimum() < lowest) {
//                            lowest = bucket.getMinimum();
//                        }
//                    }
//                    if (chartData.getHistogram().getTotalTransactionCount() != totalAccount) {
//                        throw new Exception();
//                    }
//                    average = sum / totalAccount;
//                    CarPriceDetail carPriceDetail = new CarPriceDetail();
//                    carPriceDetail.setAverage(average);
//                    carPriceDetail.setLowest(lowest);
//                    Car car = new Car(dataModel.getYearMakeModel());
//                    car.setName(dataModel.getCurrent());
//                    carPriceDetail.setCar(car);
//                    carPriceDetailArrayList.add(carPriceDetail);
//                }
//
//            }
//        }
//        return carPriceDetailArrayList;
//    }
//
//
////    public String compare(List<DataModel> dataModList) throws Exception {
////        List<CarPriceDetail> carPriceDetailList = getAverage(dataModList);
////        return compare(carPriceDetailList, dataModList);
////    }
//
//
//    public QuoteHistory selfUpdatePrice(QuoteHistory quoteHistory) throws Exception {
//        //0     1       2       3       4           5       6       7   8       9       10          11
//        //Year	Make	Model	Trim	PriceType	Fees	Price	OTD	locale	MyPrice	SalesPeson	From
//        if (quoteHistory.getFieldList()[6] != null) {
//
//            String url;
//            TaxRate taxRate = null;
//            if (quoteHistomapperry.getFieldList()[8] != null && !quoteHistory.getFieldList()[8].isEmpty()) {
//                url = restClient.generateURL_TAXAPI_ByPost(quoteHistory.getFieldList()[8]);
//                String output = restClient.call(url);
//                taxRate = mapper.readValue(output, new TypeReference<TaxRate>() {
//                });mapper
//            }
//            double rate = 0.06;
//            if (taxRate != null)
//                rate = taxRate.getTotalRate() / 100;
//            double price_Data = Double.valueOf(quoteHistory.getFieldList()[6]);
//            double base = 0;
//            double fee = 1000;
//            if (quoteHistory.getFieldList()[5] != null && !quoteHistory.getFieldList()[5].isEmpty())
//                fee = Double.valueOf(quoteHistory.getFieldList()[5]);
//            if (quoteHistory.getFieldList()[4].equalsIgnoreCase("OTD")) {
//mapper
//                base = price_Data / (1 + rate) - fee;
//            }
//            if (quoteHistory.getFieldList()[4].equalsIgnoreCase("SalePrice_No_Fee")) {
//                base = price_Data / (1 + rate);
//            }
//            double myPrice = (base + fee) * (1 + Constants.my_tax_rate);
//            quoteHistory.getFieldList()[9] = (String.valueOf(df.format(myPrice)));
//            if (!quoteHistory.getFieldList()[4].equalsIgnoreCase("SalePrice_No_Fee")
//                    && quoteHistory.getFieldList()[4].equalsIgnoreCase("OTD")
//                    && quoteHistory.getFieldList()[4].equalsIgnoreCase("SalePrice_Fee")) {
//                throw new Exception();
//            }
//
//        }
//        return quoteHistory;
//    }
//
//    public void updateQuote() throws Exception {
//        File quoteFile = new File("/Users/wchen00/Desktop/quote.csv");
//        BufferedReader br = null;
//        br = new BufferedReader(new FileReader(quoteFile));
//        StringBuilder sb_part_1 = new StringBuilder();
////        StringBuilder sb_part_2 = new StringBuilder();
//        String line = "";
//        boolean flag_title_1 = false;
//
//        while ((line = br.readLine()) != null) {
//            QuoteHistory quoteHistory;
//            String[] modelList = line.split(",");
//            if (!flag_title_1) {
//                if (modelList[0].equals("Year")) {
//                    flag_title_1 = true;
//                }
//                sb_part_1.append(line.toString());
//                sb_part_1.append("\n");
//            } else {
////                sb_part_2.append(line);
//                quoteHistory = this.selfUpdatePrice(loadRecord(line));
//                for (String field : quoteHistory.getFieldList()) {
//                    sb_part_1.append(field + ",");
//                }
//                sb_part_1.append("\n");
//            }
//
//        }
//        new DataWriter().writeQuote(sb_part_1.toString(), "/Users/wchen00/Desktop/Quote.csv");
//    }
//
//    public static QuoteHistory loadRecord(String line) {
//        String[] items = line.split(",");
//        QuoteHistory quoteHistory = new QuoteHistory();
//        quoteHistory.setFieldList(items);
//        return quoteHistory;
//    }
//
//}
