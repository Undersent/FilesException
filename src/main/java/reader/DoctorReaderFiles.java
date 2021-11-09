package reader;

import hospital.Doctor;
import hospital.Specialization;

import javax.print.Doc;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class DoctorReaderFiles implements DoctorReader {

    @Override
    public List<Doctor> readCsvWithDoctors(String absolutePath) throws IOException {
        String content = Files.readString(Paths.get(absolutePath));
        String[] splittedDoctors = content.split("\n");

        List<Doctor> doctors = new LinkedList<>();
        for (String doctorLine : splittedDoctors) {
            try {
                Doctor doctor = createDoctor(doctorLine);
                doctors.add(doctor);
            } catch (Exception e) {
                System.err.println("Exception: " + e.getMessage());
            }

        }

        return doctors;
    }

    private Doctor createDoctor(String doctorLine) {
        String[] doctorData = doctorLine.split(",");
        String name = doctorData[0].trim();
        String surname = doctorData[1].trim();

        String experienceInYears = doctorData[2].trim();
        String specializationString = doctorData[3].trim();

        Doctor doctorToAdd = new Doctor(name, surname, Integer.parseInt(experienceInYears));

        Specialization specialization = parseSpecialization(specializationString);
        doctorToAdd.setSpecialization(specialization);

        return doctorToAdd;
    }

    private Specialization parseSpecialization(String specializationString) {
        if (Specialization.CARDIOLOGIST.getDescription().equals(specializationString)) {
            return Specialization.CARDIOLOGIST;
        }
        else if (Specialization.MIDWIFE.getDescription().equals(specializationString)) {
            return Specialization.MIDWIFE;
        }
        else if (Specialization.INTERNIST.getDescription().equals(specializationString)) {
            return Specialization.INTERNIST;
        }
        throw new IllegalStateException("Cannot find defined specialization: " + specializationString);
    }
}
