package com.kodilla.sudoku;

public class SudokuSolver {

    private static Checker checker = new Checker();


    public static SudokuElement[][] solve(Position position, SudokuElement[][] board) throws SolvedSudokuException{

        if(position.end) {
            throw new SolvedSudokuException(board);
        } else
            if (board[position.horizontal][position.vertical].getStatus() == 1) {
                solve(position.setNext(), board);
            } else {
                int value = board[position.horizontal][position.vertical].getValue();
                for (int i = value; i <= 9; i++) {
                    board[position.horizontal][position.vertical].setValue(i);
                    if (checker.validation(position, board)) {
                        solve(position.setNext(), board);
                    }
                }
                board[position.horizontal][position.vertical].setValue(0);
                backTrack(position.setBack(), board);
            }
        return board;
    }


    public static void backTrack(Position position, SudokuElement[][] board) throws SolvedSudokuException {
        if(board[position.horizontal][position.vertical].getStatus() == 1) {
            backTrack(position.setBack(), board);
        }
        else {
            int value = board[position.horizontal][position.vertical].getValue();
            for(int i=value+1; i<=9; i++) {
                board[position.horizontal][position.vertical].setValue(i);
                if(checker.validation(position, board)) {
                    solve(position.setNext(), board);
                }
            }
            board[position.horizontal][position.vertical].setValue(0);
            backTrack(position.setBack(), board);
        }


    }

}
