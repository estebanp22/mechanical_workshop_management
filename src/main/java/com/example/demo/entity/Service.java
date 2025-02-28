package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "services")
@Data
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private Date serviceDate;

    @Column(nullable = false, length = 100)
    private String description;

    @OneToOne
    @JoinColumn(name = "mechanic_id")
    private Mechanic mechanic;

    @OneToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
}