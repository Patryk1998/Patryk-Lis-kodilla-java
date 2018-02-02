package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ListOfProducts {

    public static Map<String, Integer> extraFood = new HashMap<>();
    static {
        extraFood.put("White bread", 24);
        extraFood.put("Dark bread", 3);
        extraFood.put("Dietetic bread", 80);
    }



//    public static final Map<String, Integer> createListFor1Company() {
//        Map<String, Integer> resultMap = new HashMap<>();
//        resultMap.put("White bread", 24);
//        resultMap.put("Dark bread", 3);
//        resultMap.put("Dietetic bread", 80);
//        return resultMap;
//    }

    public static final Map<String, Integer> createListFor2Company() {
        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("Healthy bread", 11);
        resultMap.put("Healthy milk", 43);
        resultMap.put("Healthy butter", 12);
        return resultMap;
    }

    public static final Map<String, Integer> createListFor3Company() {
        Map<String, Integer> resultMap = new HashMap<>();
        resultMap.put("Gluten free bread", 54);
        resultMap.put("Gluten free milk", 90);
        resultMap.put("Gluten free butter", 2);
        return resultMap;
    }


}
