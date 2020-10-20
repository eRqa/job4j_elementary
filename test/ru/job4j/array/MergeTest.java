package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void whenBothEmpty() {
        int[] expect = new int[0];
        int[] result = Merge.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenReorder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 3},
                new int[] {2, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenAscOrder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[]{},
                new int[]{1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftIs1810Right79101214() {
        int[] expect = {1, 7, 8, 9, 10, 10, 12, 14};
        int[] result = Merge.merge(
                new int[] {1, 8, 10},
                new int[] {7, 9, 10, 12, 14}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftIs123ight123() {
        int[] expect = {1, 1, 2, 2, 3, 3};
        int[] result = Merge.merge(
                new int[] {1, 2, 3},
                new int[] {1, 2, 3}
        );
        assertThat(result, is(expect));
    }
}