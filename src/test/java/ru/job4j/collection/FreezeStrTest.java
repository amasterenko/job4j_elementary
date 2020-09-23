package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.FreezeStr;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FreezeStrTest {

    @Test
    public void whenEq() {
        assertThat(FreezeStr.eq("Hello", "Hlloe"), is(true));
    }

    @Test
    public void whenNotEq() {
        assertThat(FreezeStr.eq("Hello", "Halle"), is(false));
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(FreezeStr.eq("heloo", "hello"), is(false));
    }
}