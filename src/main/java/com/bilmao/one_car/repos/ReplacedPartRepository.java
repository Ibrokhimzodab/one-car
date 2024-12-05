package com.bilmao.one_car.repos;

import com.bilmao.one_car.entities.ReplacedPart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplacedPartRepository extends JpaRepository<ReplacedPart, Long> {
}
