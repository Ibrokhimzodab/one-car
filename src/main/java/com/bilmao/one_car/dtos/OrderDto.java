package com.bilmao.one_car.dtos;

import com.bilmao.one_car.entities.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private Long id;
    private CarDto car;
    private List<ServiceDto> services;
    private List<ReplacedPartDto> replacedParts;
    private OrderStatus status;
    private LocalDateTime orderDate;
    private Instant createdAt;
}
