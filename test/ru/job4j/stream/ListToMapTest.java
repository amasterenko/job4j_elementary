package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ListToMapTest {
    @Test
    public void whenListToMap() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student("Smith", 75),
                new Student("Willis", 10),
                new Student("Mask", 90)
        );
        Map<String, Student> expectedMap = new HashMap<>();
        expectedMap.put("Smith", new Student("Smith", 75));
        expectedMap.put("Willis", new Student("Willis", 10));
        expectedMap.put("Mask", new Student("Mask", 90));

        assertThat(students.stream()
                .distinct()
                .collect(Collectors.toMap(Student::getSurname, Function.identity())
                ), is(expectedMap));
    }
}
