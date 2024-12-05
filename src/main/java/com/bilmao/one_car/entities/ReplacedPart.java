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
@Table(name = "replaced_parts")
public class ReplacedPart {

    @Id
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Instant createdAt = Instant.now();
}
