package com.kodilla.sudoku;

public class SolvedSudokuException extends Exception{

    SudokuElement[][] board;

    public SolvedSudokuException(SudokuElement[][] board) {
        this.board = board;
    }

}
