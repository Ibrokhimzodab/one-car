package com.bilmao.one_car.repos;

import com.bilmao.one_car.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
