package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void when54321Then12345() {
        int[] input = new int[] {5, 4, 3, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void when12345Then12345() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void when121Then112() {
        int[] input = new int[] {1, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 1, 2};
        assertThat(result, is(expect));
    }

    @Test
    public void when628Then268() {
        int[] input = new int[] {6, 2, 8};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 6, 8};
        assertThat(result, is(expect));
    }
}