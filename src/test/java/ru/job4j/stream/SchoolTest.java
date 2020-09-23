package ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.School;
import ru.job4j.stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenClassA() {
        School school = new School();
        Predicate<Student> predicate = student -> student.getScore() >= 70 && student.getScore() <= 100;
        List<Student> students = Arrays.asList(
                new Student("Smith", 75),
                new Student("Willis", 10),
                new Student("Mask", 90)
        );
        List<Student> expected = Arrays.asList(
                new Student("Smith", 75),
                new Student("Mask", 90)
        );
        assertThat(school.collect(students, predicate), is(expected));
    }

    @Test
    public void whenClassB() {
        School school = new School();
        Predicate<Student> predicate = student -> student.getScore() >= 50 && student.getScore() < 70;
        List<Student> students = Arrays.asList(
                new Student("Smith", 75),
                new Student("Willis", 60),
                new Student("Mask", 90)
        );
        List<Student> expected = Arrays.asList(
                new Student("Willis", 60)
        );
        assertThat(school.collect(students, predicate), is(expected));
    }

    @Test
    public void whenClassC() {
        School school = new School();
        Predicate<Student> predicate = student -> student.getScore() > 0 && student.getScore() < 50;
        List<Student> students = Arrays.asList(
                new Student("Smith", 5),
                new Student("Willis", 40),
                new Student("Mask", 90)
        );
        List<Student> expected = Arrays.asList(
                new Student("Smith", 5),
                new Student("Willis", 40)
        );
        assertThat(school.collect(students, predicate), is(expected));
    }

}