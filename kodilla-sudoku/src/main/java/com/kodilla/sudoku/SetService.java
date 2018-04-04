package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetService {

    public static List<Integer> getList(Set<Integer> set) {
        List<Integer> list = new ArrayList<>();
        for(Integer element: set) {
            list.add(element);
        }
        return list;
    }

    public static Set<Integer> asSet(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for(Integer element: list) {
            set.add(element);
        }
        return set;
    }
}
