package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenFirstdMax() {
        int result = MultiMax.max(4, 3, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(0, 4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenAllEquals() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }
}