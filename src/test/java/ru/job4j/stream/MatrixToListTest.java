package ru.job4j.stream;

import org.junit.Test;
import ru.job4j.stream.MatrixToList;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatrixToListTest {
    @Test
    public void whenRectangularMatrixToList() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(MatrixToList.convert(matrix), is(expectedList));
    }

    @Test
    public void whenNotRectangularMatrixToList() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {6}
        };
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(MatrixToList.convert(matrix), is(expectedList));
    }

    @Test
    public void whenNotRectangularMatrixWithEmptyRowToList1() {
        Integer[][] matrix = {
                {1, 2, 3},
                {},
                {6}
        };
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 6);
        assertThat(MatrixToList.convert(matrix), is(expectedList));
    }
}
