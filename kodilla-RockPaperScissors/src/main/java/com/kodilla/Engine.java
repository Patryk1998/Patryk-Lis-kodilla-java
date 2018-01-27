package com.kodilla;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Engine {
    Strings strings = new Strings();
    Scanner input = new Scanner(System.in);
    ComputerMovement computerMove = new ComputerMovement();
    String playerMove;
    Player player;

    public void game(String playerMove) {
            String computer = computerMove.getMove();

            switch (playerMove) {
                case "1": {
                    if (computer.equals("1")) {
                        System.out.println("Player: ROCK\nComputer: ROCK\n(DRAW)");
                    } else if (computer.equals("2")) {
                        System.out.println("Player: ROCK\nComputer: PAPER\n(POINT FOR COMPUTER)");
                        player.addComputerPoint();
                        player.getPointsInfo();
                    } else if (computer.equals("3")) {
                        System.out.println("Player: ROCK\nComputer: SCISSORS\n(POINT FOR PLAYER)");
                        player.addPlayerPoint();
                        player.getPointsInfo();
                    }
                    break;

                }
                case "2": {
                    if (computer.equals("1")) {
                        System.out.println("Player: PAPER\nComputer: ROCK\n(POINT FOR PLAYER)");
                        player.addPlayerPoint();
                        player.getPointsInfo();
                    } else if (computer.equals("2")) {
                        System.out.println("Player: PAPER\nComputer: PAPER\n(DRAW)");
                    } else if (computer.equals("3")) {
                        System.out.println("Player: PAPER\nComputer: SCISSORS\n(POINT FOR COMPUTER)");
                        player.addComputerPoint();
                        player.getPointsInfo();
                    }
                    break;

                }
                case "3": {
                    if (computer.equals("1")) {
                        System.out.println("Player: SCISSORS\nComputer: ROCK\n(POINT FOR COMPUTER)");
                        player.addComputerPoint();
                        player.getPointsInfo();
                    } else if (computer.equals("2")) {
                        System.out.println("Player: SCISSORS\nComputer: PAPER\n(POINT FOR PLAYER)");
                        player.addPlayerPoint();
                        player.getPointsInfo();
                    } else if (computer.equals("3")) {
                        System.out.println("Player: SCISSORS\nComputer: SCISSORS\n(DRAW)");
                    }
                    break;
                }
            }
        }



    public Player playerInfo() {
        strings.askAboutName();
        String name = input.nextLine();
        strings.numberOfWonGames();
        int games = input.nextInt();
        input.nextLine();
        player = new Player(name, games);
        return player;

    }

    public void restOptions(String playerMoveString){
        switch (playerMoveString){
            case "x": {
                System.out.println("Do you relly want to end game?\nPress x again.");
                if(input.nextLine().equals("x")){
                    System.exit(11);
                }

            }
        }
    }

    public int getGames(){
        return player.getGames();
    }

    public int getComputerP(){
        return player.getComputerPoints();
    }
    public int getPlayerP(){
        return player.getPlayerPoints();
    }
}



