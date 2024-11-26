package com.spring.jwt.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class RegisterUserDto {

    private String email;
    private String password;
    private String fullName;

}
