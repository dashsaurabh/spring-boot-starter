package com.progressivecoder.demo.springbootstarter.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    private UUID id;

    private String vehicleIdentityNumber;

    private String make;

    private String model;

    private String status;

    public Vehicle() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", vehicleIdentityNumber='" + vehicleIdentityNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
