package com.bilmao.one_car.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserDto {

    @NotNull
    private String username;
    @Email
    @NotNull
    private String email;
    private String phone;
    @NotNull
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    @NotNull
    private String password;
}
