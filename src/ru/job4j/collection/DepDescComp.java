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
        int minLength = Math.min(o1Strings.length, o2Strings.length);
        for (int i = 1; i < minLength; i++) {
            compareElements = o1Strings[i].compareTo(o2Strings[i]);
            if (compareElements != 0) {
                return compareElements;
            }
        }
        return Integer.compare(o1Strings.length, o2Strings.length);
    }
}
