package com.ticketbooking.movieService.controller;

import com.ticketbooking.movieService.dto.MovieShowDto;
import com.ticketbooking.movieService.entities.MovieShow;
import com.ticketbooking.movieService.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class ShowController {
    @Autowired
    private ShowService showService;

    @PostMapping
    ResponseEntity<MovieShow> createShow(@RequestBody MovieShowDto movieShowDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(showService.createShow(movieShowDto));
    }

    @GetMapping("/getAllShowsForAMovie/{movieId}")
    ResponseEntity<List<MovieShow>> getAllShowsById(@PathVariable String movieId){
        return ResponseEntity.ok(showService.getAllShowsById(movieId));
    }

}
