package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Represents a vehicle registered in the system.
 */
@Entity
@Table(name = "vehicles")
@Data
public class Vehicle {

    /**
     * Vehicle plate (Unique identifier).
     */
    @Id
    @Column(nullable = false, length = 6)
    private String plate;

    /**
     * Name of the vehicle owner.
     */
    @Column(nullable = false, length = 100)
    private String ownerName;

    /**
     * Owner's phone number (Must be unique).
     */
    @Column(unique = true, nullable = false, length = 50)
    private String phoneNumber;
}
