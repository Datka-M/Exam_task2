package com.company.practiceTask;

public class Card {

    private String firstName;
    private String lastName;
    private int cardNumber;
    private double balance;
    private String password;


    public Card(String firstName, String lastName, int cardNumber, double balance, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
