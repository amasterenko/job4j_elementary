package ru.job4j.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FuncCalcTest {

    @Test
    public void whenLinearFunction() {
        FuncCalc function = new FuncCalc();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        FuncCalc function = new FuncCalc();
        List<Double> result = function.diapason(1, 4, x -> 2 * Math.pow(x, 2) + x + 1);
        List<Double> expected = Arrays.asList(4D, 11D, 22D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunction() {
        FuncCalc function = new FuncCalc();
        List<Double> result = function.diapason(1, 4, x -> 3 * Math.pow(2, x));
        List<Double> expected = Arrays.asList(6D, 12D, 24D);
        assertThat(result, is(expected));
    }

}
