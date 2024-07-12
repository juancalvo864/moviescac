package com.codoACodo.Peliculas.service;

import com.codoACodo.Peliculas.dto.MovieDTO;


import java.util.List;

public interface MovieService {
    MovieDTO createMovie(MovieDTO movieDTO);
    MovieDTO getMovieById(Long movieId);
    List<MovieDTO> getAllMovies();

}
