package com.company.examTask;

import com.company.examTask.enums.BloodType;
import com.company.examTask.enums.Gender;
import com.company.examTask.enums.Pay;

import java.time.LocalDate;

public class PatientCard {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String address;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private BloodType bloodType;
    private boolean isAllergy;
    private Pay pay;

    public PatientCard(String firstName, String lastName, LocalDate dateOfBirth, String address, String email, String phoneNumber, Gender gender, BloodType bloodType, boolean isAllergy, Pay pay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.bloodType = bloodType;
        this.isAllergy = isAllergy;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "PatientCard{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", gender=" + gender +
                ", bloodType=" + bloodType +
                ", isAllergy=" + isAllergy +
                ", pay=" + pay +
                '}';
    }
}
