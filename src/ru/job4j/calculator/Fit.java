package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 185;
        short WomanHeight = 172;
        System.out.println("Man 185 is " + Fit.manWeight(manHeight));
        System.out.println("Woman 172 is " + Fit.womanWeight(WomanHeight));
    }

}
