package com.kodilla;

public class Points {
    int computerPoints;
    int playerPoints;

    public Points(int computerPoints, int playerPoints) {
        this.computerPoints = computerPoints;
        this.playerPoints = playerPoints;
    }

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
}
