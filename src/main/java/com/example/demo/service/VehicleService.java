package com.example.demo.service;


import com.example.demo.entity.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {
    Vehicle saveVehicle(Vehicle vehicle);

    Optional<Vehicle> getVehicleByPlate(String plate);

    List<Vehicle> getAllVehicles();

    Vehicle updateVehicle(Vehicle vehicle);

    void deleteVehicle(String plate);
}
