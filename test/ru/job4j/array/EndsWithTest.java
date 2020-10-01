package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenWORLDandLDThenTrue() {
        char[] word = {'W', 'o', 'r', 'l', 'd'};
        char[] post = {'l', 'd'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenWorldand1dThenFalse() {
        char[] word = {'W', 'o', 'r', 'l', 'd'};
        char[] post = {'1', 'd'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

    @Test
    public void whenWorldAndTrippleD() {
        char[] word = {'W', 'o', 'r', 'l', 'd'};
        char[] post = {'d', 'd', 'd'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }

}