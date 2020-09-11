package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted((adr1, adr2) -> adr1.getCity().compareTo(adr2.getCity()))
                .distinct()
                .collect(Collectors.toList());
    }
}
