package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
    int rsl = 1;
    int length = 1;
    for (int i = 1; i < array.length; i++) {
        if (array[i] >= array[i - 1]) {
            length++;
        } else {
            if (length > rsl) {
                rsl = length;
            }
            length = 1;
        }
    }
        if (length > rsl) {
            rsl = length;
        }
    return rsl;
    }
}
