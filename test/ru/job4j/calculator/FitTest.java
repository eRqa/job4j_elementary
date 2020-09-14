package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManWeight185Then97() {

        short in = 185;
        double expected = 97.74;

        double act = Fit.manWeight(in);

        Assert.assertEquals(act, expected, 0.01);

    }

    @Test
    public void whenwomanWeight172Then713() {
        short in = 172;
        double expected = 71.3;

        double act = Fit.womanWeight(in);

        Assert.assertEquals(act, expected, 0.01);
    }
}