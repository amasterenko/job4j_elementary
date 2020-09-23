package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.FindLoop;

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
    public void whenArrayHasNot7ThenNothing() {
        int[] input = new int[]{5, 4, 3, 2, 1};
        int result = FindLoop.indexOf(input, 7);
        assertThat(result, is(-1));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 3, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind3() {
        int[] input = new int[] {3, 2, 10, 2, 4};
        int value = 3;
        int start = 1;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFinishLesStart() {
        int[] input = new int[] {3, 2, 10, 2, 4};
        int value = 3;
        int start = 4;
        int finish = 1;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayIsEmpty() {
        int[] input = new int[] {};
        int value = 3;
        int start = 4;
        int finish = 1;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }

}