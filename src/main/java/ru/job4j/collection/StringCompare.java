package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int lengthsCompare = Integer.compare(left.length(), right.length());
        int charactersCompare;
        int minLength = Math.min(left.length(), right.length());
        for (int i = 0; i < minLength; i++) {
            charactersCompare  = Character.compare(left.charAt(i), right.charAt(i));
            if (charactersCompare != 0) {
                return charactersCompare;
            }
        }
        return lengthsCompare;
    }
}
