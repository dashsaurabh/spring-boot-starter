package com.progressivecoder.demo.springbootstarter.dto;

import java.util.UUID;

public class VehicleQueryDTO {

    private UUID id;

    private String vehicleIdentityNumber;

    private String make;

    private String model;

    public VehicleQueryDTO(UUID id, String vehicleIdentityNumber, String make, String model) {
        this.id = id;
        this.vehicleIdentityNumber = vehicleIdentityNumber;
        this.make = make;
        this.model = model;
    }

    public UUID getId() {
        return id;
    }

    public String getVehicleIdentityNumber() {
        return vehicleIdentityNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "VehicleQueryDTO{" +
                "id=" + id +
                ", vehicleIdentityNumber='" + vehicleIdentityNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
