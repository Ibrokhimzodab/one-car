package com.bilmao.one_car.services;

import com.bilmao.one_car.dtos.AddEditCarDto;
import com.bilmao.one_car.dtos.CarDto;
import com.bilmao.one_car.dtos.ChangeUserDto;
import com.bilmao.one_car.dtos.CreateUserDto;
import com.bilmao.one_car.dtos.LoginResponseDto;
import com.bilmao.one_car.dtos.UserDto;
import com.bilmao.one_car.repos.CarRepository;
import com.bilmao.one_car.repos.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final CarRepository carRepository;

    public LoginResponseDto registerUser(CreateUserDto createUserDto) {
        return null;
    }

    public UserDto getUserById(Long userId) {
        return null;
    }

    public Page<UserDto> getAllUsers(Pageable pageable) {
        return null;
    }

    public UserDto changeUserInfo(Long userId, ChangeUserDto dto) {
        return null;
    }

    public CarDto addCar(Long userId, AddEditCarDto carDto) {
        return null;
    }

    public void deleteCar(Long userId, Long carId) {
    }

    public CarDto changeCarInfo(Long userId, Long carId, AddEditCarDto carDto) {
        return null;
    }
}
