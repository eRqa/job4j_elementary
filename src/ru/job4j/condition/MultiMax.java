package ru.job4j.condition;

public class MultiMax {

    public static int max(int first, int second, int third) {
        int firstOrSecond = first > second ? first : second;
        return firstOrSecond > third ? firstOrSecond : third;
    }

}
