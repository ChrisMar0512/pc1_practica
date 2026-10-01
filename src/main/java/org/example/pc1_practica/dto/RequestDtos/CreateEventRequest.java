package org.example.pc1_practica.dto.RequestDtos;

public class CreateEventRequest {
    @NotBlank private String title;
    @NotBlank private String description;
    @NotBlank private String category;
    @NotBlank private ZonedDateTime eventDate;
    @NotBlank private String location;
}
