package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean ref = data[data.length - 1];
        for (boolean curent : data) {
            if (curent != ref) {
                return false;
            }
        }
        return true;
    }
}
