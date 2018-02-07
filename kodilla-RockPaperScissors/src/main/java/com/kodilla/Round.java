package com.kodilla;

public class Round {

    private String playerName;
    private int games;

    public Round(String name, int games) {

        this.playerName = name;
        this.games = games;
    }

    public int getGames(){
        return games;
    }


}
