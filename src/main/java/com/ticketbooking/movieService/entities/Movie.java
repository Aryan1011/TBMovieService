package com.ticketbooking.movieService.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Movie {

    @Id
    private String movieId;
    private String movieName;
    private Date releaseDate;
    private Date pullDate;
    private String genre;

    public Date getPullDate() {
        return pullDate;
    }

    public void setPullDate(Date pullDate) {
        this.pullDate = pullDate;
    }

    public Movie() {
    }

    public String getMovieId() {
        return movieId;
    }

    public Movie(String movieId, String movieName, Date releaseDate, Date pullDate,String genre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.pullDate = pullDate;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
