package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws Exception {
        if(x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            String result = secondChallenge.probablyIWillThrowException(1.5,3);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Problem!");
        }finally {
            System.out.println("End of the programm!");
        }


    }}
