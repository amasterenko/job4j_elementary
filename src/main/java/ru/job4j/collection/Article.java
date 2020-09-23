package ru.job4j.collection;

import java.util.*;

public class Article {
    public static boolean generateBy(String origin, String line) {
        Map<String, Integer> dictOrigin = new HashMap<>();
        String[] originWords = origin.split(" ");
        for (String str: originWords) {
            String cleanedWord = str.replaceAll("[!?,.:;]", "");
            if (!dictOrigin.containsKey(cleanedWord)) {
                dictOrigin.put(cleanedWord, 1);
            } else {
                dictOrigin.put(cleanedWord, dictOrigin.get(cleanedWord) + 1);
            }
        }
        String[] lineWords = line.split(" ");
        for (String str : lineWords) {
            String cleanedWord = str.replaceAll("[!?,.:;]", "");
            if (!dictOrigin.containsKey(cleanedWord) || dictOrigin.get(cleanedWord) == 0) {
                return false;
            } else {
                dictOrigin.put(cleanedWord, dictOrigin.get(cleanedWord) - 1);
            }
        }
        return true;
    }
}
