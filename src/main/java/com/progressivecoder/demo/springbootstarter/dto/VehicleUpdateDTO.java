package com.progressivecoder.demo.springbootstarter.dto;

public class VehicleUpdateDTO {

    private String make;

    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "VehicleUpdateDTO{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
