package com.tms.lesson9.domain;

public class User {

    private String userName;

    private int balance;

    public User(String userName, int balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public int getBalance() {
        return balance;
    }
}
