package com.bilmao.one_car.dtos;

import com.bilmao.one_car.entities.Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderDto {

    private Long carId;
    private List<Service> service;
    private LocalDate orderDate;
}
