package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenA1B2ThenB() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenA4B1ThenA() {
        int result = Max.max(4, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenA1B99ThenB() {
        int result = Max.max(1, 99);
        assertThat(result, is(99));
    }

    @Test
    public void whenA1B1ThenAny() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }
}