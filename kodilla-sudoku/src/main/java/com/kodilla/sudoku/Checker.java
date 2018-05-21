package com.kodilla.sudoku;




public class Checker {


    public boolean validation(Position position, SudokuElement[][] board) {
        int value = board[position.horizontal][position.vertical].getValue();
        int trueCounter = 0;

        for(int i=0; i<9; i++) {
            if(board[i][position.vertical].getValue() != value) trueCounter++;
            if(board[position.horizontal][i].getValue() != value) trueCounter++;
            if(board[(position.horizontal/3)*3 + i%3][(position.vertical/3)*3 + i/3].getValue() != value) trueCounter++;
        }
        if(trueCounter == 24 && board[position.horizontal][position.vertical].getValue() != 0) return true;
        else return false;
    }
}
