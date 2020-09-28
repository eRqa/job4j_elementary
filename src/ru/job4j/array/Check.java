package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {

        boolean refEl = data[data.length - 1];

        for (boolean curEl : data) {
            if (curEl != refEl) {
                return false;
            }
        }

        return true;
    }
}
