package com.ticketbooking.movieService.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class MovieShow {
    @Id
    private String showId;
    private Date startTime;
    private Date endTime;
    @OneToOne
    @JoinColumn(name = "movieId")
    private Movie movie;
    @OneToOne
    @JoinColumn(name = "hallId")
    private MovieHall movieHall;

    public MovieShow() {
    }

    public MovieShow(String showId, Date startTime, Date endTime, Movie movie, MovieHall movieHall) {
        this.showId = showId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.movie = movie;
        this.movieHall = movieHall;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public MovieHall getMovieHall() {
        return movieHall;
    }

    public void setMovieHall(MovieHall movieHall) {
        this.movieHall = movieHall;
    }

}
