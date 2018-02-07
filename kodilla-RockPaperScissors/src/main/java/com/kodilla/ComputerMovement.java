package com.kodilla;

import java.util.Random;

public class ComputerMovement {

    public static String getMove(){
        Random generator = new Random();
        String computerMovement = Integer.toString(generator.nextInt(3)+1);
        return computerMovement;
    }
}
