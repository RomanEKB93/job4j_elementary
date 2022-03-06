package ru.job4j.array;

public class NumberToArray {

    public static int[] resolve(int number) {
        int digitsQuantity = 0;
        int numberCopy = number;
        while (numberCopy > 0) {
            numberCopy = numberCopy / 10;
            digitsQuantity++;
        }
        int[] rsl = new int[digitsQuantity];
        for (int i = 0; i < digitsQuantity; i++) {
            rsl[i] = number % 10;
            number = number / 10;
        }
        return rsl;
    }
}
