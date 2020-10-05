package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {

    @Test
    public void whenFirstMin() {
        assertThat(
                Min.findMin(
                        new int[] {0, 5, 10}
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                Min.findMin(
                        new int[] {10, 5, 3}
                ),
                is(3)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                Min.findMin(
                        new int[]{10, 2, 5}
                ),
                is(2)
        );
    }

    @Test
    public void when34567Then3() {

        int[] in = {3, 4, 5, 6, 7};
        int expected = 3;
        int act = Min.findMin(in);

        assertThat(act, is(expected)
        );
    }

    @Test
    public void when76543Then3() {

        int[] in = {7, 6, 5, 4, 3};
        int expected = 3;
        int act = Min.findMin(in);

        assertThat(act, is(expected)
        );
    }
}