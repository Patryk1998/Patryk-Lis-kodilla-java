package com.kodilla.good.patterns.challenges;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MovieStarMain {
    public static void main(String[] args) {

        String result = MovieStar.getMovies().entrySet().stream()
                .map(Map.Entry::getValue)
                .flatMap(value -> value.stream())
                .collect(Collectors.joining("!"));

        System.out.println(result);
    }
}
