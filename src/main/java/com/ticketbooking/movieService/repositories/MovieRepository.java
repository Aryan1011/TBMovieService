package com.ticketbooking.movieService.repositories;

import com.ticketbooking.movieService.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
    @Query("SELECT m FROM Movie m WHERE :currentDate > m.releaseDate AND :currentDate < m.pullDate")
    List<Movie> findMovieByDateRange(@Param("currentDate") Date currentDate);
}
