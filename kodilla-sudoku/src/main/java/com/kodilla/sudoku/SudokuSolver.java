package com.kodilla.sudoku;

public class SudokuSolver {
    static Position rememberedPosition = new Position();

    public static SudokuElement[][] solve(Position position, SudokuElement[][] board) {
        if(board[position.horizontal][position.vertical].getStatus() == 1) { //if value was added by player
            solve(position.setNext(), board);
        } else if(board[position.horizontal][position.vertical].getValue() != 0) {
            solve(position.setNext(), board);
        } else {
            if(board[position.horizontal][position.vertical].getPossibilities().size() != 0) {
                board[position.horizontal][position.vertical].setFirstPossibleValue();
                board[rememberedPosition.horizontal][rememberedPosition.vertical].positionOfPossibilityReset();
                Checker.removePossibility(position, board);
                solve(position.setNext(), board);
            } else {
                backTrack(position.setBack(), board);
            }
        }
        return board;
    }

    public static void backTrack(Position position, SudokuElement[][] board) {
        if(board[position.horizontal][position.vertical].getStatus() == 1) {
            backTrack(position.setBack(), board);
        } else {
            if(board[position.horizontal][position.vertical].getPossibilities().size() == 1) {
                backTrack(position.setBack(), board);
            } else {
                rememberedPosition.horizontal = position.horizontal;
                rememberedPosition.vertical = position.vertical;
                if (board[position.horizontal][position.vertical].getPossibilities().size()
                        >= board[position.horizontal][position.vertical].getPositionOfPossibility() + 1) {
                    Checker.addPossibility(position, board);
                    board[position.horizontal][position.vertical].setValueByIndex(board[position.horizontal][position.vertical].getPositionOfPossibility() + 1);
                    Checker.removePossibility(position, board);
                    board[position.horizontal][position.vertical].positionOfPossibilityAdd();
                    solve(position.setNext(), board);
                }
                Checker.addPossibility(position, board);
                board[position.horizontal][position.vertical].setValueZero();
                backTrack(position.setBack(), board);

            }
        }


    }
}
