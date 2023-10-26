package com.company.examTask2;

import java.util.UUID;

public class Person {

    private UUID uuid;
    private String firstName;
    private String lastName;
    private String nickName;
    private String phoneNumber;
    private String email;

    public Person(String firstName, String lastName, String nickName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
