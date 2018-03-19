package com.kodilla.sudoku;


public class TestClass {

    public static void main(String[] args) {


        SudokuElement[][] board = new SudokuElement[9][9];

        board = BoardMaker.makeBoard();
        SudokuSolver.solve(board);
        Displayer.display(board);








    }
}