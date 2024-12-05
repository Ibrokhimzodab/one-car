package com.bilmao.one_car.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddEditCarDto {

    private String vin;
    private String brand;
    private String model;
    private String year;
    private String color;
}
