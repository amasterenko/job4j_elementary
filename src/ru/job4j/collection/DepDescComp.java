package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] o1Strings = o1.split("/");
        String[] o2Strings = o2.split("/");
        int compareElements = o2Strings[0].compareTo(o1Strings[0]);
        if (compareElements != 0) {
            return compareElements;
        }
        return o1.compareTo(o2);
    }
}
