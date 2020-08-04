package ru.job4j.oop;

public class Engineer extends Profession {
    private String firstDegree;
    private String mastersDegree;

    public String getFirstDegree() {
        return firstDegree;
    }

    public String getMastersDegree() {
        return mastersDegree;
    }

    public TechnicalDocs makeDocumentation() {
        return null;
    }
}
