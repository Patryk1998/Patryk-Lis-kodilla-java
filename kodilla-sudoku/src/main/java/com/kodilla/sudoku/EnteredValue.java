package com.kodilla.sudoku;

public class EnteredValue {
    private int vertical;
    private int horizontal;
    private int number;

    public EnteredValue(String value) {
        this.horizontal = Integer.parseInt(value.substring(0,1));
        this.vertical = Integer.parseInt(value.substring(2, 3));
        this.number = Integer.parseInt(value.substring(4, 5));
    }

    public int getVertical() {
        return vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public int getNumber() {
        return number;
    }
}
