package com.example.demo.service;

import com.example.demo.entity.Service;
import com.example.demo.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class ServiceServiceImpl implements ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;

    @Override
    public Service saveService(Service service) {return serviceRepository.save(service);}

    @Override
    public Optional<Service> findById(Long id) {return serviceRepository.findById(id);}

    @Override
    public List<Service> getAllService() {return serviceRepository.findAll();}

    @Override
    public Service updateService(Service service) {return serviceRepository.save(service);}

    @Override
    public void deleteService(Long id) {serviceRepository.deleteById(id);}
}
