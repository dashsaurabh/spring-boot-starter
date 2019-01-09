package com.progressivecoder.demo.springbootstarter.repositories;

import com.progressivecoder.demo.springbootstarter.entities.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface VehicleRepository extends CrudRepository<Vehicle, UUID> {
}
