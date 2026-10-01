package org.example.pc1_practica.dto.RequestDtos;

public class RegisterRequest {
    @NotBlank private String username;
    @NotBlank @Email private String email;
    @NotBlank @Size(min=8 )private String password;
}
