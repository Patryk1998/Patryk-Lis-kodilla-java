package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class SudokuElement {
    private int value = 0;
    private int status = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setUntouchable() {
        this.status = 1;
    }

    public int getStatus() {
        return this.status;
    }

}
