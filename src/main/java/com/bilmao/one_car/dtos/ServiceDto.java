package com.bilmao.one_car.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServiceDto {

    private Long id;
    private String name;
    private Double price;
    private String description;
    private String createdAt;
}
