package com.ticketbooking.movieService.dto;

import java.util.Date;

public class MovieShowDto {
    private Date startTime;
    private Date endTime;
    private String movieHallId;
    private String movieId;

    public MovieShowDto(Date startTime, Date endTime, String movieHallId, String movieId) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.movieHallId = movieHallId;
        this.movieId = movieId;
    }

    public MovieShowDto() {
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

    public String getMovieHallId() {
        return movieHallId;
    }

    public void setMovieHallId(String movieHallId) {
        this.movieHallId = movieHallId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}
