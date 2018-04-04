package com.kodilla.sudoku;

import javafx.geometry.Pos;

public class Position {
    int vertical;
    int horizontal;

    public Position setBack() {
        if(horizontal > 0) {
            this.horizontal--;
        } else {
            this.horizontal = 8;
            this.vertical--;
        }
        return this;
    }

    public Position setNext() {
        if(horizontal < 8) {
            this.horizontal++;
        } else {
            this.horizontal = 0;
            this.vertical++;
        }
        return this;
    }

}
