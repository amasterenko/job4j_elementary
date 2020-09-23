package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstArgMax() {
        int result = Max.max(10, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecondArgMax() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenArgsEquails() {
        int result = Max.max(7, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenFirstOfThreeMax() {
        int result = Max.max(9, 7, 3);
        assertThat(result, is(9));
    }

    @Test
    public void whenSecondOfThreeMax() {
        int result = Max.max(9, 17, 3);
        assertThat(result, is(17));
    }

    @Test
    public void whenThirdOfThreeMax() {
        int result = Max.max(-9, -7, -3);
        assertThat(result, is(-3));
    }

    @Test
    public void whenAllOfThreeAreEqual() {
        int result = Max.max(1, 1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenFirstOfFourMax() {
        int result = Max.max(9, 7, 3, 3);
        assertThat(result, is(9));
    }

    @Test
    public void whenSecondOfFourMax() {
        int result = Max.max(0, 1, 0, -1);
        assertThat(result, is(1));
    }

    @Test
    public void whenThirdOfFourMax() {
        int result = Max.max(-10, -7, -3, -5);
        assertThat(result, is(-3));
    }

    @Test
    public void whenAllOfFourAreEqual() {
        int result = Max.max(1, 1, 1, 1);
        assertThat(result, is(1));
    }

}