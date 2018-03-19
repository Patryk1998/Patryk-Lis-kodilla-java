package com.kodilla.sudoku;

public class Checker {

    public boolean checkIfPut(int vertical, int horizontal, SudokuElement[][] board) {
        int trueCounter = 0;
        for(int i = 0; i < 9; i++) {
            if(board[i][vertical] == null || board[i][vertical].getValue() != board[horizontal][vertical].getValue()) trueCounter++;
            if(board[horizontal][i] == null || board[horizontal][i].getValue() != board[horizontal][vertical].getValue()) trueCounter++;
            if(board[(horizontal/3)*3 + i%3][(vertical/3)*3 + i/3] == null
                    || board[(horizontal/3)*3 + i%3][(vertical/3)*3 + i/3].getValue() != board[horizontal][vertical].getValue()) trueCounter++;
        }
        return trueCounter==24;
    }

    public static SudokuElement updatePossibilities(int vertical, int horizontal, SudokuElement[][] board) {
        for(int i = 0; i < 9; i++) {
            if(board[i][vertical] != null) {
                board[horizontal][vertical].getPossibilities().remove((Integer) board[i][vertical].getValue());
            }
            if(board[horizontal][i] != null) {
                board[horizontal][vertical].getPossibilities().remove((Integer) board[horizontal][i].getValue());
            }
            if(board[(horizontal/3)*3 + i%3][(vertical/3)*3 + i/3] != null) {
                board[horizontal][vertical].getPossibilities().remove((Integer) board[(horizontal/3)*3 + i%3][(vertical/3)*3 + i/3].getValue());
            }
        }
        return  board[horizontal][vertical];
    }
}
