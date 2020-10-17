package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int anotherOne) {
        int maxLeftOrRight = max(left, right);
        int result = maxLeftOrRight > anotherOne ? maxLeftOrRight : anotherOne;
        return result;
    }

}
