package com.ticketbooking.movieService.services.impl;

import com.ticketbooking.movieService.dto.MovieShowDto;
import com.ticketbooking.movieService.entities.Movie;
import com.ticketbooking.movieService.entities.MovieHall;
import com.ticketbooking.movieService.entities.MovieShow;
import com.ticketbooking.movieService.repositories.HallRepository;
import com.ticketbooking.movieService.repositories.MovieRepository;
import com.ticketbooking.movieService.repositories.ShowRepository;
import com.ticketbooking.movieService.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    HallRepository hallRepository;
    @Override
    public MovieShow createShow(MovieShowDto movieShowDto) {
        Movie movie =movieRepository.findById(movieShowDto.getMovieId())
                .orElseThrow(() -> new EntityNotFoundException("Movie Not found with ID: " + movieShowDto.getMovieId()));
        MovieHall movieHall = hallRepository.findById(movieShowDto.getMovieHallId())
                .orElseThrow(()-> new EntityNotFoundException("Hall not found with Id: " + movieShowDto.getMovieHallId()));

        MovieShow movieShow = new MovieShow(UUID.randomUUID().toString(),
                                            movieShowDto.getStartTime(),
                                            movieShowDto.getEndTime(),
                                            movie,
                                            movieHall);

        return showRepository.save(movieShow);
    }

    @Override
    public List<MovieShow> getAllShowsById(String movieId) {
        return showRepository.findShowByMovieId(movieId);
    }


}
