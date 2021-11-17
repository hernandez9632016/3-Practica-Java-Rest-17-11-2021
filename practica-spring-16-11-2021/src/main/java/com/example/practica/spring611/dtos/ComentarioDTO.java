package com.example.practica.spring611.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ComentarioDTO {
    @JsonProperty("type")
    private String time;
    @JsonProperty("value")
    private ValorDTO valorDTO;

}
