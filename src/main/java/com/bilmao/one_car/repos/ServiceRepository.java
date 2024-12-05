package com.bilmao.one_car.repos;

import com.bilmao.one_car.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
