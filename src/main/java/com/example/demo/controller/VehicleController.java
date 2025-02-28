package com.example.demo.controller;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin("*")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/save")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.saveVehicle(vehicle);
    }

    @GetMapping("/{plate}")
    public Optional<Vehicle> getVehicle(@PathVariable String plate) {
        return vehicleService.getVehicleByPlate(plate);
    }

    @GetMapping("/getAll")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    @PutMapping("/{plate}")
    public Vehicle updateVehicle(@PathVariable String plate, @RequestBody Vehicle vehicle) {
        vehicle.setPlate(plate);
        return vehicleService.updateVehicle(vehicle);
    }

    @DeleteMapping("/{plate}")
    public void deleteVehicle(@PathVariable String plate) {
        vehicleService.deleteVehicle(plate);
    }
}
