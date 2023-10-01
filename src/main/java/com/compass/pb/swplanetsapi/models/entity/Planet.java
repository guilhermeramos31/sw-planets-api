package com.compass.pb.swplanetsapi.models.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "planets")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String climate;
    @Column(nullable = false)
    private String terrain;
}
