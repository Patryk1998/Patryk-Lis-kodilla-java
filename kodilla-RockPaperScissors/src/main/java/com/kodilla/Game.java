package com.kodilla;

import java.util.Scanner;

public class Game {

    public static void game() {

        Scanner input = new Scanner(System.in);
        Engine engine = new Engine();

        engine.roundInfo();
        Strings.getMenu();
        while (true) {
            Strings.askAboutMove();
            String playerMove = input.nextLine();

            if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3")) {
                engine.rockPaperScissors(playerMove);
                if (Points.getPlayerPoints() == engine.getGames()) {
                    System.out.println("You won this game!");
                    System.exit(2);
                } else if (Points.getComputerPoints() == engine.getGames()) {
                    System.out.println("Computer won this game!");
                    System.exit(3);
                }
            } else if (playerMove.equals("x") || playerMove.equals("n")) {
                engine.restOptions(playerMove);
            }
        }
    }

    }



