package com.kodilla.sudoku;


public class Position {
    int vertical;
    int horizontal;
    boolean end = false;

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
        if (horizontal < 8) {
            this.horizontal++;
        } else {
            if(this.horizontal == 8 && this.vertical == 8) {
                this.end = true;
            } else {
                this.horizontal = 0;
                this.vertical++;
            }
        }

        return this;
    }

}
