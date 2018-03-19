package com.kodilla.sudoku;

public class SudokuSolver {

    public static SudokuElement[][] solve(SudokuElement[][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++){
                if(board[j][i] == null) {
                    board[j][i] = new SudokuElement();
                    board[j][i] = Checker.updatePossibilities(i, j, board);
                    board[j][i].setFirstPossibleValue();
                }
            }
        }
        return board;
    }
}
