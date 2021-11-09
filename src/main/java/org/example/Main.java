package org.example;

import org.example.hospital.HospitalRunner;
import org.example.reader.DoctorReader;
import org.example.reader.DoctorReaderFiles;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        DoctorReader doctorReader = new DoctorReaderFiles();
        HospitalRunner hospitalRunner = new HospitalRunner(doctorReader);

        String absolutePath = "/home/rafal/IdeaProjects/startFC/src/main/resources/people.csv";
        hospitalRunner.run(absolutePath);
    }
}
