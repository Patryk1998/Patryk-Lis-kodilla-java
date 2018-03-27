package com.kodilla.sudoku;

import java.util.Random;

public class SudokuSolver {


    public static SudokuElement[][] solve(SudokuElement[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i].getStatus() == 1) {
                } else if (board[j][i].getStatus() == 0) {
                    board[j][i] = Checker.updatePossibilities(i, j, board);
                    switch (board[j][i].getPossibilities().size()) {
                        case 0: {
                            backTracking(j, i, board);
                            break;
                        }
                        default: {
                            board[j][i].setFirstPossibleValue();
                            break;
                        }
                    }
                }
            }
        }
        return board;
    }

    public static void backTracking(int horizontal, int vertical, SudokuElement[][] board) {
        Position position = Checker.checkPosition(new Position(vertical, horizontal));
        for (int i = position.vertical; i > 0; i--) {
            for (int j = position.horizontal; j > 0; j--) {
                switch (board[j][i].getStatus()) {
                    case 1: break;
                    case 0: {
                        board[j][i] = Checker.updatePossibilities(i, j, board);
                        switch (board[j][i].getPossibilities().size()) {
                            case 1: break;
                            default: {
                                board[j][i].getPossibilities().remove(0);
                                board[j][i].setFirstPossibleValue();
                                board[j][i].setUntouchable();
                                solve(board);
                            }
                        }
                    }


                }
            }
        }


    }
}
