package com.kodilla.sudoku;

import java.util.Scanner;

public class BoardMaker {
    static Scanner input = new Scanner(System.in);
    static Checker checker = new Checker();

    public static SudokuElement[][] makeBoard() {
        SudokuElement[][] board = new SudokuElement[9][9];
        System.out.println("SUDOKU GAME");
        System.out.println("If you want finish and start algorithm press 'x'");
        String enteredValue = "";

        while (!enteredValue.equals("x"))
        {
            System.out.println("Enter value(horizontal, vertical, number): ");
            enteredValue = input.nextLine();
            if(!enteredValue.equals("x")){
                EnteredValue enteredValue1 = new EnteredValue(enteredValue);
                SudokuElement sudokuElement = new SudokuElement();
                sudokuElement.setValue(enteredValue1.getNumber());
                board[enteredValue1.getHorizontal()][enteredValue1.getVertical()] = sudokuElement;
                if (!checker.checkIfPut(enteredValue1.getVertical(), enteredValue1.getHorizontal(), board)) {
                    board[enteredValue1.getHorizontal()][enteredValue1.getVertical()] = null;
                    System.out.println("Not possible to put a number!");
                }
            }

        }
        return board;
    }
}
