package com.progressivecoder.demo.springbootstarter.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.UUID;

@ApiModel(description = "Model to read Vehicle information")
public class VehicleQueryDTO {

    @ApiModelProperty(notes = "Unique Id of the Vehicle")
    private UUID id;

    @ApiModelProperty(notes = "Unique registration number for a vehicle", example = "MK134567")
    private String vehicleIdentityNumber;

    @ApiModelProperty(notes = "Make of the vehicle", example = "Tesla")
    private String make;

    @ApiModelProperty(notes = "Model of the vehicle", example = "Model S")
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
