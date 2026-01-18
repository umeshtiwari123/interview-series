package com.cognizantLaptopCode;

import java.util.Arrays;
import java.util.List;

public class PatientProgram {

    public static void main(String[] args) {
        Patient p1 = new Patient ("P1", 20, "Corona" ,18000);
        Patient p2 = new Patient ("P2", 26, "Fever" ,6000);
        Patient p3 = new Patient ("P3", 29, "Corona" ,8000);
        Patient p4 = new Patient ("P4", 23, "Corona" ,12000);

        List<Patient> patientList = Arrays.asList(p1, p2, p3, p4);

        // find out the list of all the patients who are suffering from corona

        // find out the patients whose age is less than 25

        // average bill spent on corona
    }
}
