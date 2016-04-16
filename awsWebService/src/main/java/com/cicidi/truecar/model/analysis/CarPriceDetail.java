package com.cicidi.truecar.model.analysis;

import com.cicidi.truecar.model.database.Car;

/**
 * Created by wchen00 on 11/15/15.
 */
public class CarPriceDetail {
    private Car car;
    private Double average;
    private Double lowest;

    public Double getLowest() {
        return lowest;
    }

    public void setLowest(Double lowest) {
        this.lowest = lowest;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
