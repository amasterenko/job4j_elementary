package ru.job4j.oop;

import org.w3c.dom.ls.LSOutput;

public class College {
    public static void main(String[] args) {
        //Upcasting
        Student student = new Freshman();
        Object obj = student;
    }
}
