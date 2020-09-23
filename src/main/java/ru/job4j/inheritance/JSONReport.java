package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + "\t\"name\"\t:" + "\t\"" + name + "\","
                   + System.lineSeparator() + "\t\"body\"\t:" + "\t\"" + body + "\""
                   + System.lineSeparator() + "}";
    }
}
