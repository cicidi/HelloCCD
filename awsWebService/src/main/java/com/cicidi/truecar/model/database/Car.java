package com.cicidi.truecar.model.database;

import com.cicidi.common.domain.model.ServiceObject;

/**
 * Created by wchen00 on 11/16/15.
 */
public class Car extends ServiceObject {
    private String make;
    private String year;
    private String model;
    private String name;
    private String encoded_trim_id;
    private String yearMakeModel;

    public Car(String yearMakeModel) {
        this.yearMakeModel = yearMakeModel;
        String[] prop = yearMakeModel.split(" ");
        new Car(prop[0], prop[1], prop[2]);
    }

    public Car(String make, String model, String year) {
        this.make = make;
        this.year = year;
        this.model = model;
    }


    public String getEncoded_trim_id() {
        return encoded_trim_id;
    }

    public void setEncoded_trim_id(String encoded_trim_id) {
        this.encoded_trim_id = encoded_trim_id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearMakeModel() {
        return yearMakeModel;
    }

    public void setYearMakeModel(String yearMakeModel) {
        this.yearMakeModel = yearMakeModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!make.equals(car.make)) return false;
        if (!year.equals(car.year)) return false;
        if (!model.equals(car.model)) return false;
        if (!name.equals(car.name)) return false;
        if (!encoded_trim_id.equals(car.encoded_trim_id)) return false;
        return yearMakeModel.equals(car.yearMakeModel);

    }

    @Override
    public int hashCode() {
        int result = make.hashCode();
        result = 31 * result + year.hashCode();
        result = 31 * result + model.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + encoded_trim_id.hashCode();
        result = 31 * result + yearMakeModel.hashCode();
        return result;
    }
}
