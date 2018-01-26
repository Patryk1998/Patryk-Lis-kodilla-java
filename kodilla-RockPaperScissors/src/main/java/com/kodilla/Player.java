package com.kodilla;

import java.util.Set;

public class Player {
    String name;
    int games;
    int computerPoints = 0;
    int playerPoints = 0;
    Points points = new Points(computerPoints, playerPoints);

    public Player(String name, int games) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGames(){
        return games;
    }

    public void addComputerPoint(){
        computerPoints++;
    }

    public void addPlayerPoint(){
        playerPoints++;
    }

    public int getComputerPoints(){
        return computerPoints;
    }

    public int getPlayerPoints(){
        return  playerPoints;
    }

    public void getPointsInfo() {
        System.out.println("Player: " + getPlayerPoints() + "\nComputer: " + getComputerPoints());
    }
}
