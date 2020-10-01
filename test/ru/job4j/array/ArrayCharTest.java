package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenWorldStartsWithWorl() {
        char[] word = {'W', 'o', 'r', 'l', 'd'};
        char[] pref = {'W', 'o'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotWorldStartsWithWorl() {
        char[] word = {'W', 'o', 'r', 'l', 'd'};
        char[] pref = {'w', 'o'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenWorldStartsWithW0rl() {
        char[] word = {'W', 'o', 'r', 'l', 'd'};
        char[] pref = {'W', '0'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

}