package ru.job4j.oop;

public class Doctor extends Profession {
    private String ordinatura;
    private String internatura;
    private String accreditation;
    private String hospital;

    public String getHospital() {
        return hospital;
    }

    public String getOrdinatura() {
        return ordinatura;
    }

    public String getInternatura() {
        return internatura;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public Diagnosis diagnose(Pacient pacient) {
        return null;
    }

    public void fillHistory(Pacient pacient) {

    }

    public void heal(Pacient pacient) {

    }
}
