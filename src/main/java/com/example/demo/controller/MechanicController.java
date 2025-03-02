package com.example.demo.controller;

import com.example.demo.entity.Mechanic;
import com.example.demo.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing mechanics in the system.
 */
@RestController
@RequestMapping("/api/mechanic")
@CrossOrigin("*")
public class MechanicController {

    @Autowired
    private MechanicService mechanicService;

    /**
     * Saves a new mechanic in the database.
     * @param mechanic Mechanic data to be registered.
     * @return Saved mechanic.
     */
    @PostMapping("/save")
    public Mechanic addMechanic(@RequestBody Mechanic mechanic) {
        return mechanicService.saveMechanic(mechanic);
    }

    /**
     * Retrieves a mechanic by their identification document.
     * @param id Mechanic's document.
     * @return Mechanic found or empty if not exists.
     */
    @GetMapping("/{id}")
    public Optional<Mechanic> getMechanic(@PathVariable Long id) {
        return mechanicService.getMechanicById(id);
    }

    /**
     * Retrieves the list of all registered mechanics.
     * @return List of mechanics.
     */
    @GetMapping("/getAll")
    public List<Mechanic> getAllMechanics() {
        return mechanicService.getAllMechanics();
    }

    /**
     * Updates an existing mechanic's information.
     * @param id Mechanic's document to update.
     * @param mechanic Updated mechanic data.
     * @return Updated mechanic.
     */
    @PutMapping("/{id}")
    public Mechanic updateMechanic(@PathVariable Long id, @RequestBody Mechanic mechanic) {
        mechanic.setDocument(id);
        return mechanicService.updateMechanic(mechanic);
    }
}
