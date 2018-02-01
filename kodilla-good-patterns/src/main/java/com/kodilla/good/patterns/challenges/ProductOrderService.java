package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService {
    public static void main(String[] args) {

        RentRequest rentRequest = RentRequestExample.getExample();
        RentalProcessor rentalProcessor = new RentalProcessor(new SendMessageToTerminal(), new Trying(), new SavingDataInDataBase());
        RentalDto isRentedresult = rentalProcessor.process(rentRequest);
        if(isRentedresult.isRented()){
            System.exit(11);
        }
    }
}
