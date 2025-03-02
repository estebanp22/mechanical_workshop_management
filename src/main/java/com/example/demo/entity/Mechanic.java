package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity representing a mechanic in the system.
 */
@Entity
@Getter
@Setter
public class Mechanic {

    /**
     * Unique identifier for the mechanic.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long document;

    /**
     * Name of the mechanic.
     */
    private String name;

    /**
     * Phone number of the mechanic.
     */
    private String phone;
}
