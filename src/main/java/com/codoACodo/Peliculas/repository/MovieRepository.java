package com.codoACodo.Peliculas.repository;

import com.codoACodo.Peliculas.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
