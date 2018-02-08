package com.kodilla;

public class Points {

    private int computerPoints = 0;
    private int playerPoints = 0;

    public void addPlayerPoint(){
        playerPoints++;
    }

    public void addComputerPoint(){
        computerPoints++;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void getPointsInfo() {
        System.out.println("Player: " + getPlayerPoints() + "\nComputer: " + getComputerPoints());
    }

}
