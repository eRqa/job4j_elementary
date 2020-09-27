package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        boolean rsl = CheckPrimeNumber.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when17() {
        boolean rsl = CheckPrimeNumber.check(17);
        assertThat(rsl, is(true));
    }

    @Test
    public void when13() {
        boolean rsl = CheckPrimeNumber.check(13);
        assertThat(rsl, is(true));
    }

    @Test
    public void when14() {
        boolean rsl = CheckPrimeNumber.check(14);
        assertThat(rsl, is(false));
    }

}