package com.bilmao.one_car.repos;

import com.bilmao.one_car.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
