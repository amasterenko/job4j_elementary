package ru.job4j.oop;

public class Builder extends Engineer {
    private String buildAdmission;

    public String getBuildAdmission() {
        return buildAdmission;
    }

    public BuildingEstimate makeEstimate() {
        return null;
    }

    public void supervise(Construction construction) {
    }

}
