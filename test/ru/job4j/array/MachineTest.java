package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {

    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expected = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when50by35() {
        Machine machine = new Machine();
        int[] expected = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when100by10() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] rsl = machine.change(100, 10);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when100by99() {
        Machine machine = new Machine();
        int[] expected = {1};
        int[] rsl = machine.change(100, 99);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when100by1() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10, 10, 10, 10, 10, 5, 2, 2};
        int[] rsl = machine.change(100, 1);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when52by1() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 10, 1};
        int[] rsl = machine.change(52, 1);
        assertThat(rsl, is(expected));
    }

}