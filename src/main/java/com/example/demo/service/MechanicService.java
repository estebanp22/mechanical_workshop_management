package com.example.demo.service;

import com.example.demo.entity.Mechanic;

import java.util.List;
import java.util.Optional;

public interface MechanicService {

    Mechanic saveMechanic(Mechanic mechanic);

    Optional<Mechanic> getMechanicById(Long id);

    List<Mechanic> getAllMechanics();

    Mechanic updateMechanic(Mechanic mechanic);

    void deleteMechanic(Long id);
}

