package org.example.hospital;

public class Doctor extends Employee {
    private int experienceYears;
    private Specialization specialization;

    public Doctor(String name, String surname) {
        super(name, surname);
    }

    public Doctor(String name, String surname, int experienceYears) {
        super(name, surname);
        this.experienceYears = experienceYears;
    }

    public Doctor(String name, String surname, String city, String street, String postalCode, int experienceYears) {
        super(name, surname, city, street, postalCode);
        this.experienceYears = experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public String introduce() {
        return "Hi, I‘m doctor " + name + " " + this.getSurname();
    }

}