package reader;

import hospital.Doctor;
import hospital.Specialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DoctorReaderBuffer implements DoctorReader{

    @Override
    public List<Doctor> readCsvWithDoctors(String absolutePath) throws IOException {
        List<Doctor> doctors = new ArrayList<>();

        //try with resources - look to lecture or to goggle why we use it - it is a little bit different than normal try-catch
        try (BufferedReader br = new BufferedReader(new FileReader(absolutePath))) {
            //here we read a line by line, not whole file
            String doctorLine = br.readLine();
            while (doctorLine != null) {

                //todo add implementation
                //use printing to console, debugger etc. to understand how it all works

                doctorLine = br.readLine();
            }
        }
        return doctors;
    }

    private Specialization convertSpecializationFrom(String specialization) {
        if (Specialization.CARDIOLOGIST.getDescription().equals(specialization)) {
            return Specialization.CARDIOLOGIST;
        }
        else if (Specialization.MIDWIFE.getDescription().equals(specialization)) {
            return Specialization.MIDWIFE;
        }
        else if (Specialization.INTERNIST.getDescription().equals(specialization)) {
            return Specialization.INTERNIST;
        }
        throw new IllegalStateException("Cannot find defined specialization: " + specialization);
    }
}
