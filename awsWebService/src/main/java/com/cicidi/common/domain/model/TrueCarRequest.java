package com.cicidi.common.domain.model;

import com.cicidi.truecar.model.database.Car;

public class TrueCarRequest extends Request {
    private Car car;
    private String zipCode;

    public TrueCarRequest(Car car, String zipCode) {
        this.car = car;
        this.zipCode = zipCode;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}