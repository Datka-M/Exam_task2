package com.company.practiceTackLMS;

import com.company.practiceTackLMS.enums.StudyFormat;

import java.time.LocalDate;

public class Student extends Person {

    private int age;
    private StudyFormat studyFormat;

    public Student(String fullName, LocalDate dateOfBirth, String email, String phoneNumber, int age, StudyFormat studyFormat) {
        super(fullName, dateOfBirth, email, phoneNumber);
        this.age = age;
        this.studyFormat = studyFormat;
    }
}
