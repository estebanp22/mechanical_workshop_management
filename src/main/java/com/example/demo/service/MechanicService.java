package com.example.demo.service;

import com.example.demo.entity.Mechanic;
import java.util.List;
import java.util.Optional;

/**
 * Interface defining services related to mechanics.
 */
public interface MechanicService {

    /**
     * Saves a new mechanic in the system.
     * @param mechanic Mechanic to be saved.
     * @return Saved mechanic.
     */
    Mechanic saveMechanic(Mechanic mechanic);

    /**
     * Retrieves a mechanic by its ID.
     * @param id Unique identifier of the mechanic.
     * @return An Optional containing the mechanic if found, empty otherwise.
     */
    Optional<Mechanic> getMechanicById(Long id);

    /**
     * Retrieves the list of all registered mechanics.
     * @return List of mechanics.
     */
    List<Mechanic> getAllMechanics();

    /**
     * Updates the details of an existing mechanic.
     * @param mechanic Mechanic with updated data.
     * @return Updated mechanic.
     */
    Mechanic updateMechanic(Mechanic mechanic);

    /**
     * Deletes a mechanic from the system by ID.
     * @param id Unique identifier of the mechanic to delete.
     */
    void deleteMechanic(Long id);
}