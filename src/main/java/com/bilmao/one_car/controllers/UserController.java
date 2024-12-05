package com.bilmao.one_car.controllers;

import com.bilmao.one_car.dtos.AddEditCarDto;
import com.bilmao.one_car.dtos.CarDto;
import com.bilmao.one_car.dtos.ChangeUserDto;
import com.bilmao.one_car.dtos.CreateUserDto;
import com.bilmao.one_car.dtos.LoginResponseDto;
import com.bilmao.one_car.dtos.UserDto;
import com.bilmao.one_car.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<LoginResponseDto> registerUser(CreateUserDto createUserDto) {
        return ResponseEntity.ok(userService.registerUser(createUserDto));
    }

    @GetMapping
    public ResponseEntity<Page<UserDto>> getAllUsers(Pageable pageable) {
        return ResponseEntity.ok(userService.getAllUsers(pageable));
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserById(@PathVariable Long userId) {
        return ResponseEntity.ok(userService.getUserById(userId));
    }

    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> changeUserInfo(@PathVariable Long userId, ChangeUserDto dto) {
        return ResponseEntity.ok(userService.changeUserInfo(userId, dto));
    }

    @PostMapping("/{userId}/cars")
    public ResponseEntity<CarDto> addCar(@PathVariable Long userId, AddEditCarDto carDto) {
        return ResponseEntity.ok(userService.addCar(userId, carDto));
    }

    @PutMapping("/{userId}/cars/{carId}")
    public ResponseEntity<CarDto> changeCarInfo(@PathVariable Long userId, @PathVariable Long carId, AddEditCarDto carDto) {
        return ResponseEntity.ok(userService.changeCarInfo(userId, carId, carDto));
    }

    @DeleteMapping("/{userId}/cars/{carId}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long userId, @PathVariable Long carId) {
        userService.deleteCar(userId, carId);
        return ResponseEntity.ok().build();
    }
}
