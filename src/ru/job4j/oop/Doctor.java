package ru.job4j.oop;

public class Doctor extends Profession {
    private String internship;
    private String accreditation;
    private String hospital;

    public String getHospital() {
        return hospital;
    }

    public String getInternship() {
        return internship;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public Diagnosis diagnose(Pacient pacient) {
        return null;
    }

    public void fillMedicalHistory(Pacient pacient) {

    }

    public void heal(Pacient pacient) {

    }
}
