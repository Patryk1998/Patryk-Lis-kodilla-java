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

        while (!enteredValue.equals("x")) {
            System.out.println("Enter value(horizontal, vertical, number): ");
            enteredValue = input.nextLine();
            if (!enteredValue.equals("x")) {
                EnteredValue enteredValue1 = new EnteredValue(enteredValue);
                SudokuElement sudokuElement = new SudokuElement();
                sudokuElement.setValueByNumber(enteredValue1.getNumber());
                board[enteredValue1.getHorizontal()][enteredValue1.getVertical()] = sudokuElement;
                board[enteredValue1.getHorizontal()][enteredValue1.getVertical()].setUntouchable();
                if (!checker.checkIfPut(enteredValue1.getPosition(), board)) {
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

        public static SudokuElement[][] updatePossibilities(Position position, SudokuElement[][] board) {
            for (int i = 0; i < 9; i++) {
                board[position.horizontal][position.vertical].getPossibilities().remove(board[i][position.vertical].getValue());
                board[position.horizontal][position.vertical].getPossibilities().remove(board[position.horizontal][i].getValue());
                board[position.horizontal][position.vertical].getPossibilities().remove(board[(position.horizontal / 3) * 3 + i % 3][(position.vertical / 3) * 3 + i / 3].getValue());
            }
            if(position.horizontal + position.vertical != 16) {
                updatePossibilities(position.setNext(), board);
            }
            return board;
        }
}
