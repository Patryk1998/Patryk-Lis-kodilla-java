package com.kodilla.sudoku;

import javafx.geometry.Pos;

import java.util.Scanner;

public class BoardMaker {
    static Scanner input = new Scanner(System.in);
    static Checker checker = new Checker();

    public static SudokuElement[][] makeBoard(SudokuElement[][] board) {
        System.out.println("SUDOKU GAME");
        System.out.println("If you want finish and start algorithm press 'x'");
        String enteredValue = "";

        while (!enteredValue.equals("x")) {
            System.out.println("Enter value(horizontal, vertical, number): ");
            enteredValue = input.nextLine();
            if (!enteredValue.equals("x")) {
                EnteredValue enteredValue1 = new EnteredValue(enteredValue);
                SudokuElement sudokuElement = new SudokuElement();
                sudokuElement.setValue(enteredValue1.getNumber());
                board[enteredValue1.getHorizontal()][enteredValue1.getVertical()] = sudokuElement;
                board[enteredValue1.getHorizontal()][enteredValue1.getVertical()].setUntouchable();
                Position position = new Position();
                position.vertical = enteredValue1.getVertical();
                position.horizontal = enteredValue1.getHorizontal();
                if (!checker.validation(position, board)) {
                    board[enteredValue1.getHorizontal()][enteredValue1.getVertical()] = null;
                    System.out.println("Not possible to put a number!");
                }
            }

        }
        return board;
    }

    public static SudokuElement[][] fillGaps(SudokuElement[][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[j][i] == null) {
                    board[j][i] = new SudokuElement();
                }
            }
        }
        return board;
    }

}
