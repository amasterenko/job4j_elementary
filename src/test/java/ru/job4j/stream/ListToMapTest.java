package ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.ListToMap;
import ru.job4j.stream.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ListToMapTest {
    @Test
    public void whenListToMap() {
        List<Student> students = Arrays.asList(
                new Student("Smith", 75),
                new Student("Willis", 10),
                new Student("Mask", 90),
                new Student("Smith", 75)
        );
        Map<String, Student> expectedMap = new HashMap<>();
        expectedMap.put("Smith", new Student("Smith", 75));
        expectedMap.put("Willis", new Student("Willis", 10));
        expectedMap.put("Mask", new Student("Mask", 90));

        assertThat(ListToMap.convert(students), is(expectedMap));
    }
}
