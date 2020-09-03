package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        if (left.equals(right)) {
            return true;
        }
        List<Character> leftDict = new ArrayList<>();
        List<Character> rightDict = new ArrayList<>();
        for (int i = 0; i < left.length(); i++) {
            leftDict.add(i, left.charAt(i));
            rightDict.add(i, right.charAt(i));
        }
        leftDict.sort(Comparator.naturalOrder());
        rightDict.sort(Comparator.naturalOrder());
        return leftDict.equals(rightDict);
    }
}
