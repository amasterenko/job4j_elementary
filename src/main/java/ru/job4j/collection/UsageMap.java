package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("vasiliy@mail.ru", "Vasiliy Petrovich Ivanov");
        map.put("petr@ya.ru", "Petr Ivanovich Fedorov");
        map.put("ivan@gmail.com", "Ivan Fedorovich Vasiliev");
        for (String key:map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
