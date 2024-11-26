package com.spring.jwt.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class LoginUserDto {

    private String email;
    private String password;

}
