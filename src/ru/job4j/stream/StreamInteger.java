package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(-4);
        list.add(5);
        list.add(-6);
        List<Integer> filteredList = list.stream().filter(el -> el > 0).collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }
}
