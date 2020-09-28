package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void when24689Then8642() {
        int[] input = new int[] {2, 4, 6, 8, 9};
        int[] result = Turn.back(input);
        int[] expect = new int[] {9, 8, 6, 4, 2};
        assertThat(result, is(expect));
    }

    @Test
    public void when1234then4321() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expect = new int[] {4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void when12345then54321() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

}