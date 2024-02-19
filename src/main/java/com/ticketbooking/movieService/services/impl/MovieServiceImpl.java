package com.ticketbooking.movieService.services.impl;

import com.ticketbooking.movieService.entities.Movie;
import com.ticketbooking.movieService.repositories.MovieRepository;
import com.ticketbooking.movieService.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;
    @Override
    public Movie createMovie(Movie movie) {
        movie.setMovieId(UUID.randomUUID().toString());
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getNowPlayigMovies() {
        return movieRepository.findMovieByDateRange(new Date());
    }
}
