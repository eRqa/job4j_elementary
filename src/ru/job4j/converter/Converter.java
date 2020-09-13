package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int expEuro = 2;

        int dollar = Converter.rubleToDollar(120);
        int expDollar = 2;

        boolean passedEuro = euro == expEuro;
        boolean passedDollar = dollar == expDollar;

        System.out.println("140 rubles are " + euro + " euro: " + passedEuro);
        System.out.println("120 rubles are " + dollar + " dollar: " + passedDollar);
    }
}