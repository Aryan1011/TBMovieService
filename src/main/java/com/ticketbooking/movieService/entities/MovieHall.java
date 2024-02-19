package com.ticketbooking.movieService.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieHall {
    @Id
    private String hallId;
    private int numberOfSeats;
    public MovieHall() {
    }

    public String getHallId() {
        return hallId;
    }

    public MovieHall(String hallId, int numberOfSeats) {
        this.hallId = hallId;
        this.numberOfSeats = numberOfSeats;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

}
