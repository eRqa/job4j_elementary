package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FactorialTest {

    @Test
    public void calcWhen4Then24() {

        int expected = 24;
        int act = Factorial.calc(4);

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void calcWhen1Then1() {

        int expected = 1;
        int act = Factorial.calc(1);

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void calcWhen2Then2() {

        int expected = 2;
        int act = Factorial.calc(2);

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void calcWhen3Then6() {

        int expected = 6;
        int act = Factorial.calc(3);

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void calcWhen7Then5040() {

        int expected = 5040;
        int act = Factorial.calc(7);

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void calcWhenThen120() {

        int expected = 120;
        int act = Factorial.calc(5);

        Assert.assertThat(act, is(expected));

    }

    @Test
    public void calcWhen6Then720() {

        int expected = 720;
        int act = Factorial.calc(6);

        Assert.assertThat(act, is(expected));

    }
}