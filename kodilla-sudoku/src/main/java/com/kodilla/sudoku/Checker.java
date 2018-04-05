package com.kodilla.sudoku;


import javafx.geometry.Pos;

public class Checker {

    public static Integer checkIfPut(int value, Position position, SudokuElement[][] board) {
        int trueCounter = 0;
        for(int i = 0; i < 9; i++) {
            if(board[i][position.vertical] == null || board[i][position.vertical].getValue() != board[position.horizontal][position.vertical].getValue() ||
                    board[i][position.vertical].getValue() != value) trueCounter++;
            if(board[position.horizontal][i] == null || board[position.horizontal][i].getValue() != board[position.horizontal][position.vertical].getValue() ||
                    board[position.horizontal][i].getValue() != value) trueCounter++;
            if(board[(position.horizontal/3)*3 + i%3][(position.vertical/3)*3 + i/3] == null
                    || board[(position.horizontal/3)*3 + i%3][(position.vertical/3)*3 + i/3].getValue() != board[position.horizontal][position.vertical].getValue() ||
                    board[(position.horizontal/3)*3 + i%3][(position.vertical/3)*3 + i/3].getValue() != value) trueCounter++;
        }
        return trueCounter;
    }

    public static SudokuElement[][] addPossibility(Position position, SudokuElement[][] board) {
        Position checkedPosition = new Position();
        int value = board[position.horizontal][position.vertical].getValue();
        board[position.horizontal][position.vertical].setValueZero();
        for(int i = 0; i < 9; i++) {
            if(value != 0) {
                checkedPosition.horizontal = i;
                checkedPosition.vertical = position.vertical;
                if (checkIfPutSolver(value, checkedPosition, board) == 27) {
                    board[i][position.vertical].getPossibilities().add(value);
                }
                checkedPosition.horizontal = position.horizontal;
                checkedPosition.vertical = i;
                if (checkIfPutSolver(value, checkedPosition, board) == 27) {
                    board[position.horizontal][i].getPossibilities().add(value);
                }
                checkedPosition.horizontal = (position.horizontal / 3) * 3 + i % 3;
                checkedPosition.vertical = (position.vertical / 3) * 3 + i / 3;
                if (checkIfPutSolver(value, checkedPosition, board) == 27) {
                    board[(position.horizontal / 3) * 3 + i % 3][(position.vertical / 3) * 3 + i / 3].getPossibilities()
                            .add(value);
                }
            }
        }
        return board;
    }

    public static SudokuElement[][] removePossibility(Position position, SudokuElement[][] board) {
        for(int i = 0; i < 9; i++) {
            if(board[position.horizontal][position.vertical].getValue() != 0) {
                if(i != position.vertical) {
                    board[position.horizontal][i].getPossibilities().remove(board[position.horizontal][position.vertical].getValue());
                }
                if(i != position.horizontal) {
                    board[i][position.vertical].getPossibilities().remove(board[position.horizontal][position.vertical].getValue());
                }
                if((position.horizontal / 3) * 3 + i % 3 != position.horizontal && (position.vertical / 3) * 3 + i / 3 != position.vertical) {
                    board[(position.horizontal / 3) * 3 + i % 3][(position.vertical / 3) * 3 + i / 3].getPossibilities()
                            .remove(board[position.horizontal][position.vertical].getValue());
                }
            }
        }
        return board;
    }

    public static Integer checkIfPutSolver(int value, Position position, SudokuElement[][] board) {
        int trueCounter = 0;
        for (int i = 0; i < 9; i++) {
            if (board[i][position.vertical].getValue() != value) trueCounter++;
            if (board[position.horizontal][i].getValue() != value) trueCounter++;
            if (board[(position.horizontal / 3) * 3 + i % 3][(position.vertical / 3) * 3 + i / 3].getValue() != value)
                trueCounter++;
        }
        return trueCounter;
    }
}
