package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массив ages = " + ages.length);

        String[] surnames = new String[100500];
        System.out.println("Размер массив surnames = " + surnames.length);

        float[] prices = new float[40];
        System.out.println("Размер массив prices = " + prices.length);

        System.out.println("-----------------------------------");

        String[] names = new String[4];
        names[0] = "Ipolit";
        names[1] = "Jeka Lukashin";
        names[2] = "Nadya Shevelyova";
        names[3] = "Ivan Vasyl'evich";

        for (String name : names) {
            System.out.println(name);
        }
    }
}
