package com.company.examTask;

import com.company.examTask.enums.BloodType;
import com.company.examTask.enums.Days;
import com.company.examTask.enums.Gender;
import com.company.examTask.enums.Pay;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Card card = new Card("DM", "datka12", 1000, "1234");
        PatientCard patientCard = new PatientCard("Datka", "M", LocalDate.of(1999, 1, 1), "dknf", "slkfn", "sdnkf", Gender.FEMALE, BloodType.A, true, Pay.CARD);
        Patient patient = new Patient("Datka Mamatzhanova", 12, "datka@gmail.com", "124346765", "Jalal-Abad", card);
        Doctor doctor = new Doctor("Ulan", "Java", "12", 12, new Patient[]{patient});
        Hospital hospital = new Hospital(new Doctor[]{doctor}, new PatientCard[]{patientCard}, card);
        System.out.println(hospital);
    }
}
