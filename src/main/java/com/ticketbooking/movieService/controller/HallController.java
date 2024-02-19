package com.ticketbooking.movieService.controller;

import com.ticketbooking.movieService.entities.MovieHall;
import com.ticketbooking.movieService.services.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class HallController {
    @Autowired
    private HallService hallService;
    @GetMapping("/addhall")
    ResponseEntity<MovieHall> createHall(@RequestBody MovieHall movieHall){
        return  ResponseEntity.status(HttpStatus.CREATED).body(hallService.createHall(movieHall));
    }
}
