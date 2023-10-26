package com.company.examTask;

import java.util.Arrays;

public class Doctor {

    private String name;
    private String speciality;
    private String experience;
    private String email;
    private int price;
    private final String[] availableTimes = {"9:00", "11:00", "13:00", "15:00"};
    private Patient[] patients;

    public Doctor(String name, String speciality, String experience, int price, Patient[] patients) {
        this.name = name;
        this.speciality = speciality;
        this.experience = experience;
        this.price = price;
        this.patients = patients;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                ", experience='" + experience + '\'' +
                ", price=" + price +
                ", availableTimes=" + Arrays.toString(availableTimes) +
                ", patients=" + Arrays.toString(patients) +
                '}';
    }
}
