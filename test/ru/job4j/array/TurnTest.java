package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turner = new Turn();
        int[] input = new int[] {5, 7, 9, 11, 13};
        int[] result = turner.back(input);
        int[] expect = new int[] {13, 11, 9, 7, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenEmptyArray() {
        Turn turner = new Turn();
        int[] input = new int[] {};
        int[] result = turner.back(input);
        int[] expect = {};
        assertThat(result, is(expect));
    }
}