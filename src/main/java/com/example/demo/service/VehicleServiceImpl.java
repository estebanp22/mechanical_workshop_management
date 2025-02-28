package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import com.example.demo.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Optional<Vehicle> getVehicleByPlate(String plate) {
        return vehicleRepository.findById(plate);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle updateVehicle(Vehicle vehicle) {
        if (vehicleRepository.existsById(vehicle.getPlate())) {
            return vehicleRepository.save(vehicle);
        }
        return null;
    }

    @Override
    public void deleteVehicle(String plate) {
        vehicleRepository.deleteById(plate);
    }
}
