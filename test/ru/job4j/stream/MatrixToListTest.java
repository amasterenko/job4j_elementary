package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixToListTest {
    @Test
    public void whenListToMatrix() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(Arrays.stream(matrix)
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.toList()), is(expectedList));
    }
}
