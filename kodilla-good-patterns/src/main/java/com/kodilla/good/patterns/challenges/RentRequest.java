package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class RentRequest {
    private User user;
    private LocalDate rentFrom;
    private LocalDate rentTo;

    public RentRequest(User user, LocalDate rentFrom, LocalDate rentTo) {
        this.user = user;
        this.rentFrom = rentFrom;
        this.rentTo = rentTo;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getFrom() {
        return rentFrom;
    }

    public LocalDate getTo() {
        return rentTo;
    }
}
