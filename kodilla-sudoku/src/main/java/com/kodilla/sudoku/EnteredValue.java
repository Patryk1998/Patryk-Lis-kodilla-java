package com.kodilla.sudoku;

public class EnteredValue {
    private Position position = new Position();
    private int number;

    public EnteredValue(String value) {
        this.position.horizontal = Integer.parseInt(value.substring(0,1));
        this.position.vertical = Integer.parseInt(value.substring(2, 3));
        this.number = Integer.parseInt(value.substring(4, 5));
    }

    public Integer getHorizontal() {
        return position.horizontal;
    }

    public Integer getVertical() {
        return position.vertical;
    }

    public Position getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }
}
