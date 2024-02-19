package com.ticketbooking.movieService.repositories;

import com.ticketbooking.movieService.entities.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<MovieShow, String> {
    @Query(value = "select * from movie_show where movie_id: id",nativeQuery = true)
    List<MovieShow> findShowByMovieId(String id);
}
