package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void testWhenA0B0C2D0() {

        int a = 0;
        int b = 0;
        int c = 2;
        int d = 0;

        double expected = 2.0;

        double act = Point.distance(a, b, c, d);

        Assert.assertEquals(expected, act, 0.01);

    }

    @Test
    public void testWhenA0B0C5D6() {

        int a = 0;
        int b = 0;
        int c = 5;
        int d = 6;

        double expected = 7.81;

        double act = Point.distance(a, b, c, d);

        Assert.assertEquals(expected, act, 0.01);

    }

    @Test
    public void testWhenA4B2C2D8() {

        int a = 4;
        int b = 2;
        int c = 2;
        int d = 8;

        double expected = 6.32;

        double act = Point.distance(a, b, c, d);

        Assert.assertEquals(expected, act, 0.01);

    }

    @Test
    public void testWhenA6B9C1D6() {

        int a = 6;
        int b = 9;
        int c = 1;
        int d = 6;

        double expected = 5.83;

        double act = Point.distance(a, b, c, d);

        Assert.assertEquals(expected, act, 0.01);

    }
}