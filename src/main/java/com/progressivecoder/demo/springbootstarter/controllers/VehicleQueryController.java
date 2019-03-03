package com.progressivecoder.demo.springbootstarter.controllers;

import com.progressivecoder.demo.springbootstarter.dto.VehicleQueryDTO;
import com.progressivecoder.demo.springbootstarter.services.VehicleQueryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/vehicles")
@Api(tags = "Vehicle Queries", value = "VehicleQueries", description = "Controller for Vehicle Queries")
public class VehicleQueryController {

    @Autowired
    private VehicleQueryService vehicleQueryService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "List all vehicles")
    public ResponseEntity<List<VehicleQueryDTO>> listAllVehicles(){
        return new ResponseEntity<>(vehicleQueryService.listAllVehicles(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Get Vehicle By Id")
    public ResponseEntity<VehicleQueryDTO> getVehicle(@PathVariable(value = "id") UUID id){
        return new ResponseEntity<>(vehicleQueryService.getVehicle(id), HttpStatus.OK);
    }
}
