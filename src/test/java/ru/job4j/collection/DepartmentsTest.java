package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.Departments;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenFillGapsAndSortDesc() {
        List<String> input = List.of("K1", "K1/SK1", "K2/SK1", "K1/SK2");
        List<String> expect = List.of("K2", "K2/SK1", "K1", "K1/SK1", "K1/SK2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenFillGapsAndSortAsc() {
        List<String> input = List.of("K1", "K1/SK1", "K2/SK1", "K1/SK2");
        List<String> expect = List.of("K1", "K1/SK1", "K1/SK2", "K2", "K2/SK1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }
}