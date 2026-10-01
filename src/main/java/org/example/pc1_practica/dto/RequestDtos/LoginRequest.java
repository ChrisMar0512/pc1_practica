package org.example.pc1_practica.dto.RequestDtos;

public class LoginRequest {
    @NotBlank @Email private String email;
    @NotBlank @Size(min=8 )private String password;
}
