package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAsc() {
        Comparator<Job> cmpNameAsc = new CompareJobByNameAsc();
        int rsl = cmpNameAsc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameDesc() {
        Comparator<Job> cmpNameAsc = new CompareJobByNameDesc();
        int rsl = cmpNameAsc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAsc() {
        Comparator<Job> cmpPriorAsc = new CompareJobByPriorityAsc();
        int rsl = cmpPriorAsc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityDesc() {
        Comparator<Job> cmpPriorDesc = new CompareJobByPriorityDesc();
        int rsl = cmpPriorDesc.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityDesc() {
        Comparator<Job> cmpNamePriority = new CompareJobByNameDesc().thenComparing(new CompareJobByPriorityDesc());
        List<Job> list = Arrays.asList(
                new Job("TaskB", 10),
                new Job("TaskB", 5),
                new Job("TaskC", 2));
        List<Job> sortedList = List.of(
                new Job("TaskC", 2),
                new Job("TaskB", 10),
                new Job("TaskB", 5));
        list.sort(cmpNamePriority);
        assertThat(list, is(sortedList));
    }

    @Test
    public void whenComparatorByNameAndPriorityAsc() {
        Comparator<Job> cmpNamePriority = new CompareJobByNameAsc().thenComparing(new CompareJobByPriorityAsc());
        List<Job> list = Arrays.asList(
                new Job("TaskB", 10),
                new Job("TaskB", 5),
                new Job("TaskC", 2));
        List<Job> sortedList = List.of(
                new Job("TaskB", 5),
                new Job("TaskB", 10),
                new Job("TaskC", 2));
        list.sort(cmpNamePriority);
        assertThat(list, is(sortedList));
    }

    @Test
    public void whenComparatorByPriorityAndNameDesc() {
        Comparator<Job> cmpNamePriority = new CompareJobByPriorityDesc().thenComparing(new CompareJobByNameDesc());
        List<Job> list = Arrays.asList(
                new Job("TaskB", 10),
                new Job("TaskA", 10),
                new Job("TaskC", 20));
        List<Job> sortedList = List.of(
                new Job("TaskC", 20),
                new Job("TaskB", 10),
                new Job("TaskA", 10));
        list.sort(cmpNamePriority);
        assertThat(list, is(sortedList));
    }

    @Test
    public void whenComparatorByPriorityAndNameAsc() {
        Comparator<Job> cmpNamePriority = new CompareJobByPriorityAsc().thenComparing(new CompareJobByNameAsc());
        List<Job> list = Arrays.asList(
                new Job("TaskB", 10),
                new Job("TaskA", 10),
                new Job("TaskC", 20));
        List<Job> sortedList = List.of(
                new Job("TaskA", 10),
                new Job("TaskB", 10),
                new Job("TaskC", 20));
        list.sort(cmpNamePriority);
        assertThat(list, is(sortedList));
    }

}