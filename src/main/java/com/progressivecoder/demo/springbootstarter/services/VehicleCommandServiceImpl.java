package com.progressivecoder.demo.springbootstarter.services;

import com.progressivecoder.demo.springbootstarter.dto.VehicleCreateDTO;
import com.progressivecoder.demo.springbootstarter.dto.VehicleQueryDTO;
import com.progressivecoder.demo.springbootstarter.dto.VehicleUpdateDTO;
import com.progressivecoder.demo.springbootstarter.entities.Status;
import com.progressivecoder.demo.springbootstarter.entities.Vehicle;
import com.progressivecoder.demo.springbootstarter.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.UUID;

@Service
public class VehicleCommandServiceImpl implements VehicleCommandService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public UUID createVehicle(VehicleCreateDTO vehicleCreateDTO) {
        Vehicle newVehicle = new Vehicle();

        newVehicle.setId(UUID.randomUUID());
        newVehicle.setVehicleIdentityNumber(vehicleCreateDTO.getVehicleIdentityNumber());
        newVehicle.setMake(vehicleCreateDTO.getMake());
        newVehicle.setModel(vehicleCreateDTO.getModel());
        newVehicle.setStatus(String.valueOf(Status.FOR_SALE));

        return vehicleRepository.save(newVehicle).getId();
    }

    @Override
    public VehicleQueryDTO updateVehicle(UUID id, VehicleUpdateDTO vehicleUpdateDTO) {

        if (vehicleRepository.findById(id).isPresent()){
            Vehicle existingVehicle = vehicleRepository.findById(id).get();

            existingVehicle.setMake(vehicleUpdateDTO.getMake());
            existingVehicle.setModel(vehicleUpdateDTO.getModel());

            Vehicle updatedVehicle = vehicleRepository.save(existingVehicle);

            return new VehicleQueryDTO(updatedVehicle.getId(), updatedVehicle.getVehicleIdentityNumber(),
                    updatedVehicle.getMake(), updatedVehicle.getModel());
        }else{
            throw new EntityNotFoundException("Vehicle Id " + id.toString() + " not found in the database");
        }
    }

}
