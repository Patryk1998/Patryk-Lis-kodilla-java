package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    int value;
    private static List<Integer> possibilities = new ArrayList<>();
    static {
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

    public static List<Integer> getPossibilities() {
        return possibilities;
    }

    public void setFirstPossibleValue() {
        this.value = possibilities.get(0);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


}
