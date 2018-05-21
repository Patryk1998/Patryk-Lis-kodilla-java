package com.kodilla.sudoku;






public class SudokuGame {



    public static void main(String[] args) {
        Position position = new Position();
        position.vertical = 0;
        position.horizontal = 0;

        SudokuElement[][] board = new SudokuElement[9][9];
        board = BoardMaker.fillGaps(board);
        board = BoardMaker.makeBoard(board);

        long begin = System.currentTimeMillis();
        try {
            SudokuSolver.solve(position, board);
        } catch (SolvedSudokuException e) {
            Displayer.display(e.board);
        }
        long end = System.currentTimeMillis();
        System.out.println("Sudoku solved: " + (end-begin) + "[ms]");
    }
}