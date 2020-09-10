package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    public static List<Profile> sortByCity(List<Profile> profiles) {
        return profiles.stream()
                .sorted((p1, p2) -> p1.getAddress().getCity().compareTo(p2.getAddress().getCity()))
                .collect(Collectors.toList());
    }

    public static List<Profile> cutClones(List<Profile> profiles) {
        return profiles.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
