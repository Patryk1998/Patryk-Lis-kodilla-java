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
        board[horizontal][vertical].resetPossibilities();
        for(int i = 0; i < 9; i++) {
            if(board[i][vertical] != null) {
                if(i == horizontal){
                } else if(i != horizontal) board[horizontal][vertical].getPossibilities().remove((Integer) board[i][vertical].getValue());
            }
            if(board[horizontal][i] != null) {
                if(i == vertical) {
                } else if(i != vertical) board[horizontal][vertical].getPossibilities().remove((Integer) board[horizontal][i].getValue());
            }
            if(board[(horizontal/3)*3 + i%3][(vertical/3)*3 + i/3] != null) {
                if((horizontal/3)*3 + i%3 == horizontal && (vertical/3)*3 + i/3 == vertical) {
                } else if((horizontal/3)*3 + i%3 != horizontal && (vertical/3)*3 + i/3 != vertical)
                    board[horizontal][vertical].getPossibilities().remove((Integer) board[(horizontal/3)*3 + i%3][(vertical/3)*3 + i/3].getValue());
            }
        }
        return  board[horizontal][vertical];
    }

    public static Position checkPosition(Position position) {
        if(position.horizontal == 0) {
            position.setLastRow();
        } else {
            position.setBack();
        }
        return position;
    }
}
