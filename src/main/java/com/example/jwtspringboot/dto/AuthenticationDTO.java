package com.example.jwtspringboot.dto;

import lombok.Data;

@Data
public class AuthenticationDTO {

    private String email;

    private String password;

}
