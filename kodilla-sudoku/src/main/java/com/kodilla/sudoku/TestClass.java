package com.kodilla.sudoku;


public class TestClass {

    public static void main(String[] args) {


        SudokuElement[][] board;

        board = BoardMaker.makeBoard();
        board = BoardMaker.fillGaps(board);
        board = SudokuSolver.solve(board);
        Displayer.display(board);



    }
}