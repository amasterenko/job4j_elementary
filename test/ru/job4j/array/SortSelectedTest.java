package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3Elements() {
        int[] input = new int[] {-1, -2, 10};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-2, -1, 10};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5Elements() {
        int[] input = new int[] {30, 0, 1, 0, -5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-5, 0, 0, 1, 30};
        assertThat(result, is(expect));
    }
}