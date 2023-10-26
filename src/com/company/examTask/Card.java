package com.company.examTask;

public class Card {

    private String fullName;
    private String password;
    private double balance;
    private String props;

    public Card(String fullName, String password, double balance, String props) {
        this.fullName = fullName;
        this.password = password;
        this.balance = balance;
        this.props = props;
    }

    @Override
    public String toString() {
        return "Card{" +
                "fullName='" + fullName + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", props='" + props + '\'' +
                '}';
    }
}
