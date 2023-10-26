package com.company.examTask;

import java.util.Arrays;

public class Hospital {

    private Doctor[] doctors;
    private PatientCard[] patientCards;
    private Card card;

    public Hospital(Doctor[] doctors, PatientCard[] patientCards, Card card) {
        this.doctors = doctors;
        this.patientCards = patientCards;
        this.card = card;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "doctors=" + Arrays.toString(doctors) +
                ", patientCards=" + Arrays.toString(patientCards) +
                ", card=" + card +
                '}';
    }
}
