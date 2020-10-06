package ru.job4j.array;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] in = {
                {10}
        };
        int expect = 10;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenTwo() {
        int[][] in = {
                {1, 2},
                {1, 2}
        };
        int expect = 6;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenThree() {
        int[][] in = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int expect = 7;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when3to3() {
        int[][] in = {
                {1, 1, 1},
                {2, 2, 2},
                {0, 100, 0}
        };
        int expect = 109;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void when5to2() {
        int[][] in = {
                {1, 1, 1, 1, 1},
                {2, 3}
        };
        int expect = 10;
        int rsl = MatrixSum.sum(in);
        assertThat(rsl, is(expect));
    }
}