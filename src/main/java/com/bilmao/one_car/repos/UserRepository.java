package com.bilmao.one_car.repos;

import com.bilmao.one_car.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
