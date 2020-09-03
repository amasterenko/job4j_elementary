package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        Set<String> dict = new HashSet<>();
        String[] originWords = origin.split(" ");
        for (String str: originWords) {
            dict.add(str.replaceAll("[!?,.:;]", ""));
        }
        String[] lineWords = line.split(" ");
        String[] lineClearWords = new String[lineWords.length];
        for (int i = 0; i < lineWords.length; i++) {
            lineClearWords[i] = lineWords[i].replaceAll("[!?,.:;]", "");
        }
        return dict.containsAll(Arrays.asList(lineClearWords));
    }
}
