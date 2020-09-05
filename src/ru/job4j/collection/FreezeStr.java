package ru.job4j.collection;

import java.util.*;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] leftStr = left.toCharArray();
        char[] rightStr = right.toCharArray();
        Map<Character, Integer> leftMap = new HashMap<>();
        for (char symbol : leftStr) {
            if (!leftMap.containsKey(symbol)) {
                leftMap.put(symbol, 1);
            } else {
                leftMap.put(symbol, leftMap.get(symbol) + 1);
            }
        }
        for (char symbol : rightStr) {
            if (!leftMap.containsKey(symbol) || leftMap.get(symbol) == 0) {
                return false;
            } else {
                leftMap.put(symbol, leftMap.get(symbol) - 1);
            }
        }
        return true;
    }
}
