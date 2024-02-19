package com.ticketbooking.movieService.services;

import com.ticketbooking.movieService.dto.MovieShowDto;
import com.ticketbooking.movieService.entities.MovieShow;

import java.util.List;

public interface ShowService {
    MovieShow createShow(MovieShowDto movieShowDto);

    List<MovieShow> getAllShowsById(String movieId);
}
