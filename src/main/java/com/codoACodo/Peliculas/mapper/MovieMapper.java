package com.codoACodo.Peliculas.mapper;

import com.codoACodo.Peliculas.dto.MovieDTO;
import com.codoACodo.Peliculas.models.Movie;

public class MovieMapper {
    public static MovieDTO mapToMovieDTO (Movie movie){
        return new MovieDTO(
                movie.getId(),
                movie.getTitulo(),
                movie.getGenero(),
                movie.getDuracion(),
                movie.getImagen()
        );
    }
    public static Movie mapToMovie(MovieDTO movieDTO){
        return new Movie(
                movieDTO.getId(),
                movieDTO.getTitulo(),
                movieDTO.getGenero(),
                movieDTO.getDuracion(),
                movieDTO.getImagen()
        );
    }
}
