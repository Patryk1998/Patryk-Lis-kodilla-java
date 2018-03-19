package com.kodilla.sudoku;

public class Displayer {

    public static void display(SudokuElement[][] board) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                switch (j) {
                    case 0: {
                        System.out.print("|");
                    }
                    default: {
                        if(board[j][i] == null) System.out.print(" " + "  |");
                        else System.out.print(" " + board[j][i] + " |");
                    }
                }
            }
            System.out.print("\n" + "--------------------------------------" + "\n");
        }
    }
}
