package ru.job4j.calculate;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class X2Test {

    @Test
    public void whenBCZero() {
        /* Входные параметры. Их будет 4 штуки */
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        /* ожидаемое значение. Это всегда одна переменная. */
        int expected = 40;
        /* вызов метода, который хотим проверить. */
        /* Результат вычисления. Это всегда одна переменная. */
        int rsl = X2.calc(a, b, c, x);
        /* сравнение полученного значения с ожидаемым */
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenA1B1C1X1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;

        int expected = 3;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenA0B1C1X1() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;

        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenA1B1C0X1() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;

        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenA1B1C1X0() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;

        int expected = 1;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

}