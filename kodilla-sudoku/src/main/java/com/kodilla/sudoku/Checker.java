package com.kodilla.sudoku;


import javafx.geometry.Pos;

public class Checker {

    public static boolean checkIfPut(Position position, SudokuElement[][] board) {
        int trueCounter = 0;
        for(int i = 0; i < 9; i++) {
            if(board[i][position.vertical] == null || board[i][position.vertical].getValue() != board[position.horizontal][position.vertical].getValue()) trueCounter++;
            if(board[position.horizontal][i] == null || board[position.horizontal][i].getValue() != board[position.horizontal][position.vertical].getValue()) trueCounter++;
            if(board[(position.horizontal/3)*3 + i%3][(position.vertical/3)*3 + i/3] == null
                    || board[(position.horizontal/3)*3 + i%3][(position.vertical/3)*3 + i/3].getValue() != board[position.horizontal][position.vertical].getValue()) trueCounter++;
        }
        return trueCounter==24;
    }

    public static SudokuElement[][] addPossibility(Position position, SudokuElement[][] board) {
        Position checkedPosition = new Position();
        for(int i = 0; i < 9; i++) {
            if(board[position.horizontal][position.vertical].getValue() != 0) {
                if(i != position.horizontal) {
                    checkedPosition.horizontal = i;
                    checkedPosition.vertical = position.vertical;
                    if(checkIfPut(checkedPosition, board)) {
                        board[i][position.vertical].getPossibilities().add(board[position.horizontal][position.vertical].getValue());
                    }
                }
                if(i != position.vertical) {
                    checkedPosition.horizontal = position.horizontal;
                    checkedPosition.vertical = i;
                    if(checkIfPut(checkedPosition, board)) {
                        board[position.horizontal][i].getPossibilities().add(board[position.horizontal][position.vertical].getValue());
                    }
                }
                if((position.horizontal / 3) * 3 + i % 3 != position.horizontal && (position.vertical / 3) * 3 + i / 3 != position.vertical) {
                    checkedPosition.horizontal = (position.horizontal / 3) * 3 + i % 3;
                    checkedPosition.vertical = (position.vertical / 3) * 3 + i / 3;
                    if(checkIfPut(checkedPosition, board)) {

                        board[(position.horizontal / 3) * 3 + i % 3][(position.vertical / 3) * 3 + i / 3].getPossibilities()
                                .add(board[position.horizontal][position.vertical].getValue());
                    }
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
}
