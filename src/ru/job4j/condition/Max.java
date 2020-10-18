package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int maxFirstOrSecond = max(first, second);
        int result = maxFirstOrSecond > third ? maxFirstOrSecond : third;
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int maxFirstOrSecondOrThird = max(first, second, third);
        int result = maxFirstOrSecondOrThird > fourth ? maxFirstOrSecondOrThird : fourth;
        return result;
    }

}
