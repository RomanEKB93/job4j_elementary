package ru.job4j.array;

public class NumberToArray {

    public static int[] resolve(int number) {
        int length = 0;
        int numberCopy = number;
        while (numberCopy > 0) {
            numberCopy = numberCopy / 10;
            length++;
        }
        int[] rsl = new int[length];
        for (int i = 0; i < length; i++) {
            rsl[i] = number % 10;
            number = number / 10;
        }
        return rsl;
    }
}
