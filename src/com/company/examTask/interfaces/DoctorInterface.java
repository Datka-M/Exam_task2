package com.company.examTask.interfaces;

import com.company.examTask.Patient;

public interface DoctorInterface {

    Patient[] getAllDoctorsPatientsByEmail(String email);

    Patient getPatientByEmail(String email);


}