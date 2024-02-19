package com.ticketbooking.movieService.services.impl;

import com.ticketbooking.movieService.entities.MovieHall;
import com.ticketbooking.movieService.repositories.HallRepository;
import com.ticketbooking.movieService.services.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class HallServiceImpl implements HallService {
    @Autowired
    private HallRepository hallRepository;
    @Override
    public MovieHall createHall(MovieHall movieHall) {
        movieHall.setHallId(UUID.randomUUID().toString());
        return hallRepository.save(movieHall);
    }
}
