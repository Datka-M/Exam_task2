package com.company.examTask;

public class Patient {

    private String fullName;
    private int age;
    private String email;
    private String phoneNumber;
    private String address;
    private Card card;

    public Patient(String fullName, int age, String email, String phoneNumber, String address, Card card) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.card = card;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", card=" + card +
                '}';
    }
}
