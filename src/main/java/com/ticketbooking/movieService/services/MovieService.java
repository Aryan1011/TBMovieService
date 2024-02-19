package com.ticketbooking.movieService.services;

import com.ticketbooking.movieService.entities.Movie;

import java.util.List;

public interface MovieService {
    Movie createMovie(Movie movie);

    List<Movie> getNowPlayigMovies();
}
