package com.example.restapiexample.auth.dto.register;
import lombok.Data;

@Data
public class RegistrationRequest {
    private String email;
    private String password;
    private String name;
    private int age;
}
