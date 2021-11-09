import hospital.HospitalRunner;
import reader.DoctorReader;
import reader.DoctorReaderFiles;

import java.io.*;
import java.lang.reflect.Field;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {

        DoctorReader doctorReader = new DoctorReaderFiles();
        HospitalRunner hospitalRunner = new HospitalRunner(doctorReader);

        String absolutePath = "/home/rafal/IdeaProjects/startFC/src/main/resources/people.csv";
        hospitalRunner.run(absolutePath);
    }
}
