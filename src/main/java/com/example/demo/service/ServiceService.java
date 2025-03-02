package com.example.demo.service;

import com.example.demo.entity.Service;
import java.util.List;
import java.util.Optional;

/**
 * Interface defining services related to maintenance or repairs.
 */
public interface ServiceService {

    /**
     * Saves a new service in the system.
     * @param service Service to be saved.
     * @return Saved service.
     */
    Service saveService(Service service);

    /**
     * Finds a service by its ID.
     * @param id Unique identifier of the service.
     * @return An Optional containing the service if found, empty otherwise.
     */
    Optional<Service> findById(Long id);

    /**
     * Retrieves the list of all registered services.
     * @return List of services.
     */
    List<Service> getAllService();

    /**
     * Updates the details of an existing service.
     * @param service Service with updated data.
     * @return Updated service.
     */
    Service updateService(Service service);

    /**
     * Deletes a service from the system by ID.
     * @param id Unique identifier of the service to delete.
     */
    void deleteService(Long id);
}