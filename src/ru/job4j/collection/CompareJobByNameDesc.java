package ru.job4j.collection;

import java.util.Comparator;

public class CompareJobByNameDesc implements Comparator<Job> {
    @Override
    public int compare(Job j1, Job j2) {
        return j2.getName().compareTo(j1.getName());
    }
}
