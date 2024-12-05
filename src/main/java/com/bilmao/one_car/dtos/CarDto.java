package com.bilmao.one_car.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {

    private Long id;
    private String vin;
    private String brand;
    private String model;
    private String year;
    private String color;
    private Instant createdAt;
}
