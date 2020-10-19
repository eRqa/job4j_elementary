package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void testWhenA0B0C2D0() {

        Point a = new Point(0, 0);
        Point b = new Point(2, 0);

        double expected = 2.0;

        double act = a.distance(b);

        Assert.assertEquals(expected, act, 0.01);

    }

    @Test
    public void testWhenA0B0C5D6() {

        Point a = new Point(0, 0);
        Point b = new Point(5, 6);

        double expected = 7.81;

        double act = a.distance(b);

        Assert.assertEquals(expected, act, 0.01);

    }

    @Test
    public void testWhenA4B2C2D8() {

        Point a = new Point(4, 2);
        Point b = new Point(2, 8);

        double expected = 6.32;

        double act = a.distance(b);

        Assert.assertEquals(expected, act, 0.01);

    }

    @Test
    public void testWhenA6B9C1D6() {

        Point a = new Point(6, 9);
        Point b = new Point(1, 6);

        double expected = 5.83;

        double act = a.distance(b);

        Assert.assertEquals(expected, act, 0.01);

    }

    @Test
    public void testWhen342And567Then5744() {

        Point a = new Point(3, 4, 2);
        Point b = new Point(5, 6, 7);

        double expected = 5.74;

        double act = a.distance3d(b);

        Assert.assertEquals(expected, act, 0.01);

    }
}