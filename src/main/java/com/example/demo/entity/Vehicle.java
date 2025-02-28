package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "vehicles")
@Data
public class Vehicle {

    @Id
    @Column(nullable = false, length = 6)
    private String plate;

    @Column(nullable = false, length = 100)
    private String ownerName;

    @Column(unique = true, nullable = false, length = 50)
    private String phoneNumber;

}