package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;

/**
 * Represents a service performed on a vehicle.
 */
@Entity
@Table(name = "services")
@Data
public class Service {

    /**
     * Unique identifier for the service.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Date when the service was performed.
     */
    @Column(nullable = false, length = 100)
    private Date serviceDate;

    /**
     * Description of the service performed.
     */
    @Column(nullable = false, length = 100)
    private String description;

    /**
     * Mechanic responsible for the service.
     */
    @OneToOne
    @JoinColumn(name = "mechanic_id")
    private Mechanic mechanic;

    /**
     * Vehicle that received the service.
     */
    @OneToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;
}