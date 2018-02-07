package com.kodilla;

public class Points {

    private static int computerPoints = 0;
    private static int playerPoints = 0;

    public static void addPlayerPoint(){
        playerPoints++;
    }

    public static void addComputerPoint(){
        computerPoints++;
    }

    public static int getComputerPoints() {
        return computerPoints;
    }

    public static int getPlayerPoints() {
        return playerPoints;
    }

    public static void getPointsInfo() {
        System.out.println("Player: " + getPlayerPoints() + "\nComputer: " + getComputerPoints());
    }

}
