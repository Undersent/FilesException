package org.example.hospital;

public class TooManyEmployeesException extends Exception {
    public TooManyEmployeesException(String message) {
        super(message);
    }
}
