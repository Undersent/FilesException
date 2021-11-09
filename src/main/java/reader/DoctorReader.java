package reader;

import hospital.Doctor;

import java.io.IOException;
import java.util.List;

public interface DoctorReader {

    /**
     *
     * @param absolutePath - absolute path to the file
     * @return - List of doctors which can be hired
     * @throws IOException - when I/O error occurs
     */
    List<Doctor> readCsvWithDoctors(String absolutePath) throws IOException;
}
