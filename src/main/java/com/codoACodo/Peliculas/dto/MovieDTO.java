package com.codoACodo.Peliculas.dto;

import com.codoACodo.Peliculas.models.Movie;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MovieDTO {
    private Long id;
    private String titulo;
    private String genero;
    private String duracion;
    private String imagen;



}
