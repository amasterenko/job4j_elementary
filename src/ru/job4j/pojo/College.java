package ru.job4j.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class College {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();
        student.setName("Fedorov Ivan Petrovich");
        student.setGroupNumber("012281");
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        student.setAdmissionDate(df.parse("10.04.2020"));
        System.out.println("Student " + student.getName() + ", group № " + student.getGroupNumber() + ", admission date is " + df.format(student.getAdmissionDate()));
    }
}
