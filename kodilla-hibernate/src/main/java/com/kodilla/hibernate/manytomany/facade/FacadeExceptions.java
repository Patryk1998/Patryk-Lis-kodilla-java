package com.kodilla.hibernate.manytomany.facade;

public class FacadeExceptions extends Exception {

    public final static String ADD_TO_LIST_EMPLOYEE = "Adding employees to the common list failed!";

    public FacadeExceptions(String message) {
        super(message);
    }
}
