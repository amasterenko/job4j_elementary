package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenEmptyArr() {
        int[] input = new int[] {};
        int[] expect = null;
        int[] rsl = SwitchArray.swap(input, 0, 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapNegativeSourceIndxto3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = null;
        int[] rsl = SwitchArray.swap(input, -1, 3);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapOutboundSourceIndxto3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = null;
        int[] rsl = SwitchArray.swap(input, input.length, 3);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap3toNegativeDestIndx() {
        int[] input = {1, 2, 3, 4};
        int[] expect = null;
        int[] rsl = SwitchArray.swap(input, 3, -1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap3toOutboundDestIndx() {
        int[] input = {1, 2, 3, 4};
        int[] expect = null;
        int[] rsl = SwitchArray.swap(input, 3, input.length);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapNegativeSourceIndxtoNegativeDestIndx() {
        int[] input = {1, 2, 3, 4};
        int[] expect = null;
        int[] rsl = SwitchArray.swap(input, -2, -1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapOutboundSourceIndxtoOutboundDestIndx() {
        int[] input = {1, 2, 3, 4};
        int[] expect = null;
        int[] rsl = SwitchArray.swap(input, input.length * 2, input.length);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapNegativeSourceIndxtoOutboundDestIndx() {
        int[] input = {1, 2, 3, 4};
        int[] expect = null;
        int[] rsl = SwitchArray.swap(input, -1, input.length * 2);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwapOutboundSourceIndxtooNegativeDestIndx() {
        int[] input = {1, 2, 3, 4};
        int[] expect = null;
        int[] rsl = SwitchArray.swap(input, input.length * 2, -1);
        assertThat(rsl, is(expect));
    }
}