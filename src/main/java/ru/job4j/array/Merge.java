package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex + rightIndex < rsl.length) {

            if (leftIndex == left.length || rightIndex != right.length && left[leftIndex] > right[rightIndex]) {
                rsl[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
            } else {
                rsl[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
            }
        }

        return rsl;
    }
}
