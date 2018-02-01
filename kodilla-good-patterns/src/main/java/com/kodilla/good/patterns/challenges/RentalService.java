package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface RentalService {
    boolean rent(User user, LocalDate rentFrom, LocalDate rentTo);
}
