package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinDiapasonTest {

    @Test
    public void whenFirstMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {-1, 0, 5, 10},
                        1, 3
                ),
                is(0)
        );
    }

    @Test
    public void whenLastMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {10, 5, 3, 1},
                        1, 3
                ),
                is(1)
        );
    }

    @Test
    public void whenMiddleMin() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {10, 2, 5, 1},
                        0, 2
                ),
                is(2)
        );
    }

    @Test
    public void when13579Between0And3Then() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {1, 3, 5, 5, 7, 9},
                        0, 3
                ),
                is(1)
        );
    }

    @Test
    public void when13579Between2And4Then() {
        assertThat(
                MinDiapason.findMin(
                        new int[] {1, 3, 5, 7, 9},
                        2, 4
                ),
                is(5)
        );
    }

}