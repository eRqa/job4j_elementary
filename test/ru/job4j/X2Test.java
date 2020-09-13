package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    @Test
    public void testcalcwhena1b1c1x1() {

        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;

        int expected = 3;
        int result = X2.calc(a, b, c, d);

        Assert.assertEquals(expected, result);

    }

    @Test
    public void testcalcwhena0b1c1x1() {

        int a = 0;
        int b = 1;
        int c = 1;
        int d = 1;

        int expected = 2;
        int result = X2.calc(a, b, c, d);

        Assert.assertEquals(expected, result);

    }

    @Test
    public void testcalcwhena1b1c0x1() {

        int a = 1;
        int b = 1;
        int c = 0;
        int d = 1;

        int expected = 2;
        int result = X2.calc(a, b, c, d);

        Assert.assertEquals(expected, result);

    }

    @Test
    public void testcalcwhena1v1c1x0() {

        int a = 1;
        int b = 1;
        int c = 1;
        int d = 0;

        int expected = 1;
        int result = X2.calc(a, b, c, d);

        Assert.assertEquals(expected, result);

    }
}