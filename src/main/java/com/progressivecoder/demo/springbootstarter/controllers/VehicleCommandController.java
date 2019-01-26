package com.progressivecoder.demo.springbootstarter.controllers;

import com.progressivecoder.demo.springbootstarter.dto.VehicleCreateDTO;
import com.progressivecoder.demo.springbootstarter.dto.VehicleQueryDTO;
import com.progressivecoder.demo.springbootstarter.dto.VehicleUpdateDTO;
import com.progressivecoder.demo.springbootstarter.services.VehicleCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "/api/vehicles")
public class VehicleCommandController {

    @Autowired
    private VehicleCommandService vehicleCommandService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UUID> createVehicle(@RequestBody VehicleCreateDTO vehicleCreateDTO){
        return new ResponseEntity<>(vehicleCommandService.createVehicle(vehicleCreateDTO), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<VehicleQueryDTO> updateVehicle(@PathVariable(value = "id") UUID id,
                                                         @RequestBody VehicleUpdateDTO vehicleUpdateDTO){
        return new ResponseEntity<>(vehicleCommandService.updateVehicle(id, vehicleUpdateDTO), HttpStatus.OK);
    }
}
