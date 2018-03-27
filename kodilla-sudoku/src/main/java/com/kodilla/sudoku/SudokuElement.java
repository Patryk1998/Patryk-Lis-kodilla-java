package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private int value;
    private int status = 0;
    private List<Integer> possibilities = new ArrayList<>();

    public SudokuElement() {
            possibilities.add(1);
            possibilities.add(2);
            possibilities.add(3);
            possibilities.add(4);
            possibilities.add(5);
            possibilities.add(6);
            possibilities.add(7);
            possibilities.add(8);
            possibilities.add(9);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public List<Integer> getPossibilities() {
        return possibilities;
    }

    public void setFirstPossibleValue() {
        this.value = possibilities.get(0);
    }

    public void setUntouchable() {
        this.status = 1;
    }

    public int getStatus() {
        return this.status;
    }

    public void resetPossibilities() {
        possibilities = new ArrayList<>();
        possibilities.add(1);
        possibilities.add(2);
        possibilities.add(3);
        possibilities.add(4);
        possibilities.add(5);
        possibilities.add(6);
        possibilities.add(7);
        possibilities.add(8);
        possibilities.add(9);
    }

}
