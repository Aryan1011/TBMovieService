package com.ticketbooking.movieService.repositories;

import com.ticketbooking.movieService.entities.MovieHall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends JpaRepository<MovieHall, String> {
}
