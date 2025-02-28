package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "mechanics")
@Data
public class Mechanic {
    @Id
    @Column(nullable = false, length = 100)
    private Long document;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String profession;
}
