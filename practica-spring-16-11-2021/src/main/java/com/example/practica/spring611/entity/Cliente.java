package com.example.practica.spring611.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class Cliente {
    private String nombre;
    private String dni;
    private String domicilio;
    private List<String> prestamos;
}