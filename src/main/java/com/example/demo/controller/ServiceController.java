package com.example.demo.controller;

import com.example.demo.entity.Service;
import com.example.demo.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing services in the system.
 */
@RestController
@RequestMapping("/api/servicio")
@CrossOrigin("*")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    /**
     * Saves a new service in the database.
     * @param service Service data to be registered.
     * @return Saved service.
     */
    @PostMapping("/save")
    public Service saveService(@RequestBody Service service) {
        return serviceService.saveService(service);
    }

    /**
     * Retrieves a service by its ID.
     * @param id Unique identifier of the service.
     * @return Service found or empty if not exists.
     */
    @GetMapping("/{id}")
    public Optional<Service> getService(@PathVariable Long id) {
        return serviceService.findById(id);
    }

    /**
     * Retrieves the list of all registered services.
     * @return List of services.
     */
    @GetMapping("/getAll")
    public List<Service> getAllService() {
        return serviceService.getAllService();
    }

    /**
     * Updates an existing service's information.
     * @param id ID of the service to update.
     * @param service Updated service data.
     * @return Updated service.
     */
    @PutMapping("/{id}")
    public Service updateService(@RequestBody Service service, @PathVariable Long id) {
        service.setId(id);
        return serviceService.updateService(service);
    }
}
