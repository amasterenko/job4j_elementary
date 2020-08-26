package ru.job4j.collection;

import java.util.Comparator;

public class CompareJobByPriorityDesc implements Comparator<Job> {
    @Override
    public int compare(Job j1, Job j2) {
        return Integer.compare(j2.getPriority(), j1.getPriority());
    }
}
