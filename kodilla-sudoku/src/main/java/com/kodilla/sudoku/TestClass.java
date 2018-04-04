package com.kodilla.sudoku;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestClass {



    public static void main(String[] args) {

        Position position = new Position();
        position.horizontal = 0;
        position.vertical = 0;
        SudokuElement[][] board;
        board = BoardMaker.makeBoard();
        board = BoardMaker.fillGaps(board);
        board = BoardMaker.updatePossibilities(position, board);
        position.horizontal = 0;
        position.vertical = 0;
        board = SudokuSolver.solve(position, board);
        Displayer.display(board);




    }
}