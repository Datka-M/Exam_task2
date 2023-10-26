package com.company.practiceTackLMS;

import java.time.LocalDate;

public class Instructor extends Person {

    private String speciality;
    private int experience;

    public Instructor(String fullName, LocalDate dateOfBirth, String email, String phoneNumber, String speciality, int experience) {
        super(fullName, dateOfBirth, email, phoneNumber);
        this.speciality = speciality;
        this.experience = experience;
    }
}
