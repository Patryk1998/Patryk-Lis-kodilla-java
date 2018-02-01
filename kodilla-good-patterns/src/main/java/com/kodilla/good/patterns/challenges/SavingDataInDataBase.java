package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class SavingDataInDataBase implements RentalRepository{

    @Override
    public void createRental(User user, LocalDate rentFrom, LocalDate rentTo) {
        System.out.println("Entry: user: " + user.getName() + " " + user.getSurname()
        + ", hire: product, date: from " + rentFrom + " to " + rentTo + ".");
    }
}
