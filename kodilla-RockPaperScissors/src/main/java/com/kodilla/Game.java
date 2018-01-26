package com.kodilla;

import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Strings strings = new Strings();
        Scanner input = new Scanner(System.in);
        Engine engine = new Engine();
        engine.playerInfo();
        strings.askAboutMove();
        String playerMove = "";
        String playerMoveString = "";
        if(input.hasNextInt()){
            playerMove = Integer.toString(input.nextInt());
        } else playerMoveString = input.nextLine();
        if(playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3")){
            engine.game(playerMove);
        } else if(playerMoveString.equals("x")){
            engine.restOptions(playerMoveString);
        } else if(playerMoveString.equals("n")) {
            System.out.println("Do you relly want to stary new game?\nPress n to confirm.");
            if(input.nextLine().equals("n")){

            }
        }








    }


    }
