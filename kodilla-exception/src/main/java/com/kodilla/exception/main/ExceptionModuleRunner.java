package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;

import java.net.URISyntaxException;

public class ExceptionModuleRunner {
    public static void main(String args[]) throws URISyntaxException {
        FileReader fileReader = new FileReader();
        fileReader.readFile();

    }
}
