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

        SudokuElement[][] test = new SudokuElement[9][9];
        Displayer.display(test);




    }

//    public static Integer x(int value) {
//        String test = String.valueOf(value);
//        char[] board = test.toCharArray();
//        StringBuffer result = new StringBuffer();
//        for(int i = board.length-1; i>=0; i--) {
//            result.append(board[i]);
//        }
//        Integer resultInteger = Integer.parseInt(result.toString());
//        return  resultInteger;
//    }
//
//    public int reverseNumber(int number){
//        int reverse = 0;
//        while(number != 0){
//            reverse = (reverse*10)+(number%10);
//            number = number/10;
//        }
//        return reverse;
//    }

}