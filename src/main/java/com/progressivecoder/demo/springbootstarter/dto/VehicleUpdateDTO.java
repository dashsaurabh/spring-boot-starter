package com.progressivecoder.demo.springbootstarter.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel(description = "Model to update an existing Vehicle")
public class VehicleUpdateDTO {

    @NotNull
    @Size(max = 10, message = "Make of Vehicle cannot have more than 10 characters")
    @ApiModelProperty(notes = "Make of the vehicle", example = "Tesla")
    private String make;

    @NotNull
    @Size(max = 10, message = "Model of Vehicle cannot have more than 10 characters")
    @ApiModelProperty(notes = "Model of the vehicle", example = "Model S")
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
