package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] leftNumbers = left.split(" ")[0].split("\\.");
        String[] rightNumbers = right.split(" ")[0].split("\\.");
        int lengthCompare = Integer.compare(leftNumbers.length, rightNumbers.length);
        int minLength = Math.min(leftNumbers.length, rightNumbers.length);
        for (int i = 0; i < minLength; i++) {
            int numbersCompare = Integer.compare(Integer.parseInt(leftNumbers[i]), Integer.parseInt(rightNumbers[i]));
            if (numbersCompare != 0) {
                return numbersCompare;
            }
        }
        return lengthCompare;
    }
}
