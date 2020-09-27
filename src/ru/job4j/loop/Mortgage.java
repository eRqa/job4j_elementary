package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double remains = amount;
        double coefficient = percent / 100;

        while (remains > 0) {
            remains = remains + (remains * coefficient);
            remains = remains - salary;
            year++;
        }

        return year;

    }

}
