package com.kodilla.sudoku;

import java.util.HashSet;
import java.util.Set;

public class SudokuElement {
    private int value;
    private int status = 0;
    private int positionOfPossibility = 0;
    private Set<Integer> possibilities = new HashSet<>();

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

    public Integer setValueZero() {
        this.value = 0;
        return 0;
    }

    public void setValueByNumber(int number) {
        this.value = number;
    }

    public Integer setValueByIndex(int index) {
        this.value = SetService.getList(possibilities).get(index);
        return value;
    }

    public Set<Integer> getPossibilities() {
        return possibilities;
    }

    public Integer setFirstPossibleValue() {
        this.value = SetService.getList(possibilities).get(0);
        return value;
    }

    public void setUntouchable() {
        this.status = 1;
    }

    public int getStatus() {
        return this.status;
    }

    public Integer getPositionOfPossibility() {
        return this.positionOfPossibility;
    }

    public void positionOfPossibilityAdd() {
        this.positionOfPossibility++;
    }

    public void positionOfPossibilityReset() {
        this.positionOfPossibility = 0;
    }

}
