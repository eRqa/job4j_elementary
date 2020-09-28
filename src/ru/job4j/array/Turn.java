package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {

        int arrayLength = array.length;
        int arrayHalfLength = (arrayLength % 2) == 0 ? (arrayLength / 2) - 1 : arrayLength / 2;

        for (int i = 0; i <= arrayHalfLength; i++) {

            int arrayLengthMinusI = arrayLength - (i + 1);

            int tmp = array[i];
            array[i] = array[arrayLengthMinusI];
            array[arrayLengthMinusI] = tmp;
        }

        return array;
    }
}
