package com.codoACodo.Peliculas.service.impl;

import com.codoACodo.Peliculas.dto.MovieDTO;
import com.codoACodo.Peliculas.mapper.MovieMapper;
import com.codoACodo.Peliculas.models.Movie;
import com.codoACodo.Peliculas.repository.MovieRepository;
import com.codoACodo.Peliculas.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Override
    public MovieDTO createMovie(MovieDTO movieDTO) {
        Movie movie = MovieMapper.mapToMovie(movieDTO);
        Movie saveMovie = movieRepository.save(movie);
        return null;
    }

    @Override
    public MovieDTO getMovieById(Long movieId) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(()-> new ResourceNotFoundException("Movie is not exist"));
        return MovieMapper.mapToMovieDTO(movie);
    }


    @Override
    public List<MovieDTO> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movies.stream().map((movie) -> MovieMapper.mapToMovieDTO(movie)).collect(Collectors.toList());
    }
}
