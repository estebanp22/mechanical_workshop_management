package com.example.demo.controller;

import com.example.demo.entity.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing vehicles in the system.
 */
@RestController
@RequestMapping("/api/vehicles")
@CrossOrigin("*")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    /**
     * Saves a new vehicle in the database.
     * @param vehicle Vehicle data to be registered.
     * @return Saved vehicle.
     */
    @PostMapping("/save")
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.saveVehicle(vehicle);
    }

    /**
     * Retrieves a vehicle by its plate number.
     * @param plate Vehicle's plate number.
     * @return Vehicle found or empty if not exists.
     */
    @GetMapping("/{plate}")
    public Optional<Vehicle> getVehicle(@PathVariable String plate) {
        return vehicleService.getVehicleByPlate(plate);
    }

    /**
     * Retrieves the list of all registered vehicles.
     * @return List of vehicles.
     */
    @GetMapping("/getAll")
    public List<Vehicle> getAllVehicles() {
        return vehicleService.getAllVehicles();
    }

    /**
     * Updates an existing vehicle's information.
     * @param plate Plate number of the vehicle to update.
     * @param vehicle Updated vehicle data.
     * @return Updated vehicle.
     */
    @PutMapping("/{plate}")
    public Vehicle updateVehicle(@PathVariable String plate, @RequestBody Vehicle vehicle) {
        vehicle.setPlate(plate);
        return vehicleService.updateVehicle(vehicle);
    }

    /**
     * Deletes a vehicle from the system by its plate number.
     * @param plate Plate number of the vehicle to delete.
     */
    @DeleteMapping("/{plate}")
    public void deleteVehicle(@PathVariable String plate) {
        vehicleService.deleteVehicle(plate);
    }
}
