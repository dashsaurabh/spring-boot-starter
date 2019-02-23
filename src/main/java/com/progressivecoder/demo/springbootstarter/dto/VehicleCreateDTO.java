package com.progressivecoder.demo.springbootstarter.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class VehicleCreateDTO {

    @NotNull
    @Size(min = 8, message = "Vehicle Registration Number should have at least 8 characters")
    private String vehicleIdentityNumber;

    @NotNull
    @Size(max = 10, message = "Make of Vehicle cannot have more than 10 characters")
    private String make;

    @NotNull
    @Size(max = 10, message = "Model of Vehicle cannot have more than 10 characters")
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
