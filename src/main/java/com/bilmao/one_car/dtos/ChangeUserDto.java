package com.bilmao.one_car.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChangeUserDto {

    private String username;
    private String email;
    private String phone;
    private String firstName;
    private String lastName;
    private String birthDate;
}
