package org.example.hospital;

import org.example.reader.DoctorReader;

import java.io.IOException;
import java.util.List;

public class HospitalRunner {
    private static final int SIZE = 20;
    private final DoctorReader doctorReader;

    public HospitalRunner(DoctorReader doctorReader) {
        this.doctorReader = doctorReader;
    }

    public void run(String absolutePath) throws IOException {
        List<Doctor> doctors = doctorReader.readCsvWithDoctors(absolutePath);
        Hospital hospital = new Hospital(SIZE);
        try {
            for (Doctor doctor : doctors) {
                hospital.addEmployee(doctor);
            }
        } catch (TooManyEmployeesException e) {
            System.out.println(e.getMessage());
        }
    }
}
