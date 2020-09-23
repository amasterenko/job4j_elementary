package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.SkipNegative;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}