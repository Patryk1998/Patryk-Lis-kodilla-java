package com.kodilla.sudoku;

public class Change {
    int toChange;
    int changed;
}


//if (i != position.vertical) {
//        board[position.horizontal][i].getPossibilities().remove(board[position.horizontal][position.vertical].getChanged());
//        }
//        if (i != position.horizontal) {
//        board[i][position.vertical].getPossibilities().remove(board[position.horizontal][position.vertical].getChanged());
//        }
//        if ((position.horizontal / 3) * 3 + i % 3 != position.horizontal && (position.vertical / 3) * 3 + i / 3 != position.vertical) {
//        board[(position.horizontal / 3) * 3 + i % 3][(position.vertical / 3) * 3 + i / 3].getPossibilities()
//        .remove(board[position.horizontal][position.vertical].getChanged());
//        }
//        if (board[position.horizontal][position.vertical].getToChange() != 0) {
//        if (i != position.vertical) {
//        if (board[position.horizontal][i].getPossibilities().stream().noneMatch(Integer -> Integer == board[position.horizontal][position.vertical].getToChange())) {
//        board[position.horizontal][i].getPossibilities().add(board[position.horizontal][position.vertical].getToChange());
//        }
//        }
//        if (i != position.horizontal) {
//        if (board[i][position.horizontal].getPossibilities().stream().noneMatch(Integer -> Integer == board[position.horizontal][position.vertical].getToChange())) {
//        board[i][position.vertical].getPossibilities().add(board[position.horizontal][position.vertical].getToChange());
//        }
//        }
//        if ((position.horizontal / 3) * 3 + i % 3 != position.horizontal && (position.vertical / 3) * 3 + i / 3 != position.vertical) {
//        if (board[(position.horizontal / 3) * 3 + i % 3][(position.vertical / 3) * 3 + i / 3]
//        .getPossibilities().stream().noneMatch(Integer -> Integer == board[position.horizontal][position.vertical].getToChange())) {
//        board[(position.horizontal / 3) * 3 + i % 3][(position.vertical / 3) * 3 + i / 3].getPossibilities()
//        .add(board[position.horizontal][position.vertical].getToChange());
//        }
//        }



//
//if(board[position.horizontal][position.vertical].getPossibilities().size()
//        >= board[position.horizontal][position.vertical].getPositionOfPossibility()+1) {
//        board[position.horizontal][position.vertical].setToChange(board[position.horizontal][position.vertical].getValue());
//        board[position.horizontal][position.vertical].setChanged(board[position.horizontal][position.vertical]
//        .setValueByIndex(board[position.horizontal][position.vertical].getPositionOfPossibility()+1));
//        board[position.horizontal][position.vertical].setValueByIndex(board[position.horizontal][position.vertical].getPositionOfPossibility()+1);
//        board[position.horizontal][position.vertical].positionOfPossibilityAdd();
//        board = Checker.updatePossibilitiess(position, board);
//        solve(position.setNext(), board);
//        }
//        board[position.horizontal][position.vertical].setToChange(board[position.horizontal][position.vertical].getValue());
//        board[position.horizontal][position.vertical].setChanged(0);
//        board[position.horizontal][position.vertical].setValueZero();
//        board = Checker.updatePossibilitiess(position, board);
//        backTrack(position.setBack(), board);