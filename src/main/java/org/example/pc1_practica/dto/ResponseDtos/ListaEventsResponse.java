package org.example.pc1_practica.dto.ResponseDtos;
@Data
public class ListaEventsResponse {
    private long id;
    private String title;
    private String Category;
    private ZonedDateTime eventDate;
    private long availableSlots;

}
