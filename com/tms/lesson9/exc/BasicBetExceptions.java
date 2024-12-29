package com.tms.lesson9.exc;

public class BasicBetExceptions extends RuntimeException {
    private String errorMessage;

    public BasicBetExceptions(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getMessage() {
        return errorMessage;
    }
}
