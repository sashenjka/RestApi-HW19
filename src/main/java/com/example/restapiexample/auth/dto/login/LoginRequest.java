package com.example.restapiexample.auth.dto.login;
import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
