package com.progressivecoder.demo.springbootstarter.services;

import com.progressivecoder.demo.springbootstarter.dto.VehicleCreateDTO;
import com.progressivecoder.demo.springbootstarter.dto.VehicleQueryDTO;
import com.progressivecoder.demo.springbootstarter.dto.VehicleUpdateDTO;

import java.util.UUID;

public interface VehicleCommandService {

    public UUID createVehicle(VehicleCreateDTO vehicleCreateDTO);
    public VehicleQueryDTO updateVehicle(UUID id, VehicleUpdateDTO vehicleUpdateDTO);

}
