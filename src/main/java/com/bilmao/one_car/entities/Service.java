package com.bilmao.one_car.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Getter
@Setter
@Table(name = "services")
public class Service {

    @Id
    private Long id;
    private String name;
    private Double price;
    private String description;
    private Instant createdAt = Instant.now();
}
