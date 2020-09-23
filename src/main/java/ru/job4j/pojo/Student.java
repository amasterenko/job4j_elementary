package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String name;
    private String groupNumber;
    private Date admissionDate;

    public void setName(String name) {
        this.name = name;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getName() {
        return name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }
}
