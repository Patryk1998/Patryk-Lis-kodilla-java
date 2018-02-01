package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class RentRequestExample {

    public static RentRequest getExample() {
        User user = new User("Jan", "Nowak");
        LocalDate rentFrom = LocalDate.of(2017, 2, 22);
        LocalDate rentTo = LocalDate.of(2017, 4, 21);
        return new RentRequest(user, rentFrom, rentTo);
    }
}
