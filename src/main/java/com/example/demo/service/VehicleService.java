package com.example.demo.service;

import com.example.demo.entity.Vehicle;
import java.util.List;
import java.util.Optional;

/**
 * Interface defining services related to vehicles.
 */
public interface VehicleService {

    /**
     * Saves a new vehicle in the system.
     * @param vehicle Vehicle to be saved.
     * @return Saved vehicle.
     */
    Vehicle saveVehicle(Vehicle vehicle);

    /**
     * Retrieves a vehicle by its plate.
     * @param plate Vehicle plate.
     * @return An Optional containing the vehicle if found, empty otherwise.
     */
    Optional<Vehicle> getVehicleByPlate(String plate);

    /**
     * Retrieves the list of all registered vehicles.
     * @return List of vehicles.
     */
    List<Vehicle> getAllVehicles();

    /**
     * Updates the details of an existing vehicle.
     * @param vehicle Vehicle with updated data.
     * @return Updated vehicle.
     */
    Vehicle updateVehicle(Vehicle vehicle);

    /**
     * Deletes a vehicle from the system by its plate.
     * @param plate Vehicle plate to delete.
     */
    void deleteVehicle(String plate);
}
