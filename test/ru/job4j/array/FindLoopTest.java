package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] input = new int[]{5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7Then4() {
        int[] input = new int[]{5, 4, 3, 2, 7};
        int result = FindLoop.indexOf(input, 7);
        assertThat(result, is(4));
    }

    @Test
    public void whenArrayHasNot7Then0() {
        int[] input = new int[]{5, 4, 3, 2, 1};
        int result = FindLoop.indexOf(input, 7);
        assertThat(result, is(-1));
    }
}