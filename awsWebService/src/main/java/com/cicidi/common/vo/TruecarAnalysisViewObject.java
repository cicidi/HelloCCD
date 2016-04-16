package com.cicidi.common.vo;

import com.cicidi.common.domain.model.ServiceObject;
import com.cicidi.truecar.model.database.Car;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by jianming on 4/14/16.
 */
@Component
public class TruecarAnalysisViewObject extends ServiceObject {
    public Car car;
    public Map<String, String> trimPriceDiff;
    public Map<String, Map<String, String>> trimPricesDetail;

    final String averageSalePrice = "average saleprice";
    final String lowestSalePrice = "lowest sale price";
    final String averageOTDPrice = "average OTD price";
    final String lowestOTDPrice = "lowest OTD price";

    public TruecarAnalysisViewObject() {
    }

    public TruecarAnalysisViewObject(Car car) {
        this.car = car;
        this.trimPriceDiff = new LinkedHashMap<>();
        this.trimPricesDetail = new LinkedHashMap<>();
    }

    public void addTrimPriceDiff(String twoTrimName, String diff) {
        this.trimPriceDiff.put(twoTrimName, String.valueOf(diff));
    }

    public void addAverageSalePrice(String trim, String price) {
        if (this.trimPricesDetail.get(trim) == null) {
            this.trimPricesDetail.put(trim, new HashMap<>());
        }
        this.trimPricesDetail.get(trim).put(averageSalePrice, price);
    }

    public void addLowestSalePrice(String trim, String price) {
        if (this.trimPricesDetail.get(trim) == null) {
            this.trimPricesDetail.put(trim, new HashMap<>());
        }
        this.trimPricesDetail.get(trim).put(lowestSalePrice, price);
    }

    public void addAverageOTDPrice(String trim, String price) {
        if (this.trimPricesDetail.get(trim) == null) {
            this.trimPricesDetail.put(trim, new HashMap<>());
        }
        this.trimPricesDetail.get(trim).put(averageOTDPrice, price);
    }

    public void addlowestOTDPrice(String trim, String price) {
        if (this.trimPricesDetail.get(trim) == null) {
            this.trimPricesDetail.put(trim, new HashMap<>());
        }
        this.trimPricesDetail.get(trim).put(lowestOTDPrice, price);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Map<String, String> getTrimPriceDiff() {
        return trimPriceDiff;
    }

    public void setTrimPriceDiff(Map<String, String> trimPriceDiff) {
        this.trimPriceDiff = trimPriceDiff;
    }

    public Map<String, Map<String, String>> getTrimPricesDetail() {
        return trimPricesDetail;
    }

    public void setTrimPricesDetail(Map<String, Map<String, String>> trimPricesDetail) {
        this.trimPricesDetail = trimPricesDetail;
    }
}
