package com.example.jwtspringboot.services.auth;

import com.example.jwtspringboot.dto.SignupDTO;
import com.example.jwtspringboot.dto.UserDTO;

public interface AuthService {
    UserDTO createUser(SignupDTO signupDTO);
}
