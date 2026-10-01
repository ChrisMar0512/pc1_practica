package org.example.pc1_practica.controller;

@RestController
@Required Args Constructor
@PostMapping (/auth/register)

public class registercontroller {
    private final AuthService authservice;
    public ResponseEntity <RegisterResponse> register(@Valid @RequestBody RegisterRequest req){
        return ResponseEntity.status(httpstatus.CREATED), body(authService.register(req));
    }
}
