package com.ticketbooking.movieService.controller;
import com.ticketbooking.movieService.entities.Movie;
import com.ticketbooking.movieService.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/addmovie")
    ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
        return ResponseEntity.status(HttpStatus.CREATED).body(movieService.createMovie(movie));
    }

    @GetMapping("/inTheaters")
    ResponseEntity<List<Movie>> getNowPlayingMovies(){
        return ResponseEntity.ok(movieService.getNowPlayigMovies());
    }

}
