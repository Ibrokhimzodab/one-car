package com.bilmao.one_car.dtos;

import com.bilmao.one_car.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDto {

    private Long id;
    private String username;
    private String email;
    private String phone;
    private Role role;
    private String accessToken;
    private String refreshToken;
}
