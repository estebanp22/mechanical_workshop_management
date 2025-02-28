package com.example.demo.controller;

import com.example.demo.entity.Mechanic;
import com.example.demo.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mechanic")
@CrossOrigin("*")
public class MechanicController {

    @Autowired
    private MechanicService mechanicService;

    @PostMapping("/save")
    public Mechanic addMechanic(@RequestBody Mechanic mechanic) {
        return mechanicService.saveMechanic(mechanic);
    }

    @GetMapping("/{id}")
    public Optional<Mechanic> getMechanic(@PathVariable Long id) {
        return mechanicService.getMechanicById(id);
    }

    @GetMapping("/getAll")
    public List<Mechanic> getAllMechanics() {
        return mechanicService.getAllMechanics();
    }

    @PutMapping("/{id}")
    public Mechanic updateMechanic(@PathVariable Long id, @RequestBody Mechanic mechanic) {
        mechanic.setDocument(id);
        return mechanicService.updateMechanic(mechanic);
    }
}

