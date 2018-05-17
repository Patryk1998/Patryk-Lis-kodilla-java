package com.kodilla.sudoku;



import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestClass {



    public static void main(String[] args) {
        Position position = new Position();
        position.vertical = 0;
        position.horizontal = 0;

        SudokuElement[][] board = new SudokuElement[9][9];
        board = BoardMaker.fillGaps(board);

        SudokuSolver.solve(position, BoardMaker.makeBoard(board));





    }




}