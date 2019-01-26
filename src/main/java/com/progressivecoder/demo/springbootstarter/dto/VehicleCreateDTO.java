package com.progressivecoder.demo.springbootstarter.dto;

public class VehicleCreateDTO {

    private String vehicleIdentityNumber;

    private String make;

    private String model;

    public String getVehicleIdentityNumber() {
        return vehicleIdentityNumber;
    }

    public void setVehicleIdentityNumber(String vehicleIdentityNumber) {
        this.vehicleIdentityNumber = vehicleIdentityNumber;
    }

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
        return "VehicleCreateDTO{" +
                "vehicleIdentityNumber='" + vehicleIdentityNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
