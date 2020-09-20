package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenA1B2C3() {
        int result = MultiMax.max(1, 2, 3);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void whenA3B2C1() {
        int result = MultiMax.max(3, 2, 1);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void whenA228B44C1337() {
        int result = MultiMax.max(228, 44, 1337);
        int expected = 1337;
        assertThat(result, is(expected));
    }

    @Test
    public void whenA65B13C777() {
        int result = MultiMax.max(65, 13, 777);
        int expected = 777;
        assertThat(result, is(expected));
    }

    @Test
    public void whenA2B2C2() {
        int result = MultiMax.max(2, 2, 2);
        int expected = 2;
        assertThat(result, is(expected));
    }
}