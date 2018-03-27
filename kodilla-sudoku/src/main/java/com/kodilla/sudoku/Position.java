package com.kodilla.sudoku;

public class Position {
    int vertical;
    int horizontal;

    public Position(int vertical, int horizontal) {
        this.vertical = vertical;
        this.horizontal = horizontal;
    }

    public void setLastRow() {
        this.horizontal = 8;
        this.vertical--;
    }

    public void setBack() {
        this.horizontal--;
    }
}
