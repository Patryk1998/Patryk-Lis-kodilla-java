package com.kodilla;

import java.util.Scanner;

public class Engine {

    Scanner input = new Scanner(System.in);
    Points points = new Points();
    private Round round;

    public void rockPaperScissors(String playerMove) {
        String computer = ComputerMovement.getMove();

        switch (playerMove) {
            case "1": {
                if (computer.equals("1")) {
                    System.out.println("Player: ROCK\nComputer: ROCK\n(DRAW)");
                } else if (computer.equals("2")) {
                    System.out.println("Player: ROCK\nComputer: PAPER\n(POINT FOR COMPUTER)");
                    points.addComputerPoint();
                    points.getPointsInfo();
                } else if (computer.equals("3")) {
                    System.out.println("Player: ROCK\nComputer: SCISSORS\n(POINT FOR PLAYER)");
                    points.addPlayerPoint();
                    points.getPointsInfo();
                }
                break;
            }
            case "2": {
                if (computer.equals("1")) {
                    System.out.println("Player: PAPER\nComputer: ROCK\n(POINT FOR PLAYER)");
                    points.addPlayerPoint();
                    points.getPointsInfo();
                } else if (computer.equals("2")) {
                    System.out.println("Player: PAPER\nComputer: PAPER\n(DRAW)");
                } else if (computer.equals("3")) {
                    System.out.println("Player: PAPER\nComputer: SCISSORS\n(POINT FOR COMPUTER)");
                    points.addComputerPoint();
                    points.getPointsInfo();
                }
                break;
            }
            case "3": {
                if (computer.equals("1")) {
                    System.out.println("Player: SCISSORS\nComputer: ROCK\n(POINT FOR COMPUTER)");
                    points.addComputerPoint();
                    points.getPointsInfo();
                } else if (computer.equals("2")) {
                    System.out.println("Player: SCISSORS\nComputer: PAPER\n(POINT FOR PLAYER)");
                    points.addPlayerPoint();
                    points.getPointsInfo();
                } else if (computer.equals("3")) {
                    System.out.println("Player: SCISSORS\nComputer: SCISSORS\n(DRAW)");
                }
                break;
            }
        }
    }

    public void roundInfo() {
        Strings.askAboutName();
        String playerName = input.nextLine();
        Strings.numberOfWonGames();
        int games = input.nextInt();
        input.nextLine();
        round = new Round(playerName, games);
    }

    public void restOptions(String playerMove){
        switch (playerMove){
            case "x": {
                System.out.println("Do you really want to end game?\nPress x again.");
                if (input.nextLine().equals("x")){
                    System.exit(11);
                }
            }
            case "n": {
                System.out.println("Do you really want to stary new game?\nPress n to confirm.");
                if (input.nextLine().equals("n")) {
                    Game.game();
                }
            }
        }
    }

    public int getGames(){
        return round.getGames();
    }

}



