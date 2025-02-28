package com.example.demo.service;

import com.example.demo.entity.Mechanic;
import com.example.demo.repository.MechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MechanicServiceImpl implements MechanicService {

    @Autowired
    private MechanicRepository mechanicRepository;

    @Override
    public Mechanic saveMechanic(Mechanic mechanic) {
        return mechanicRepository.save(mechanic);
    }

    @Override
    public Optional<Mechanic> getMechanicById(Long id) {
        return mechanicRepository.findById(id);
    }

    @Override
    public List<Mechanic> getAllMechanics() {
        return mechanicRepository.findAll();
    }

    @Override
    public Mechanic updateMechanic(Mechanic mechanic) {
        if (mechanicRepository.existsById(mechanic.getDocument())) {
            return mechanicRepository.save(mechanic);
        }
        return null;
    }

    @Override
    public void deleteMechanic(Long id) {
        mechanicRepository.deleteById(id);
    }

}

