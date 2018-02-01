package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class Trying implements RentalService{

    @Override
    public boolean rent(User user, LocalDate rentFrom, LocalDate rentTo) {
        System.out.println("Welcome on our website. You (" + user.getName() + ") want to rent our product from... to ...");
        return true;
    }
}
