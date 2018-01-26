package com.kodilla;

import java.util.Random;

public class ComputerMovement {
    String computerMovment;

    public String getMove(){
        Random generator = new Random();
        computerMovment = Integer.toString(generator.nextInt(3)+1);
        return computerMovment;
    }
}
