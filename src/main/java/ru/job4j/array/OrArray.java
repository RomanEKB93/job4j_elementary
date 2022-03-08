package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        boolean repeat;
        for (int number : left) {
            repeat = false;
            for (int k = 0; k < index; k++) {
                if (rsl[k] == number) {
                repeat = true;
                break;
                }
            }
            if (!repeat) {
                rsl[index] = number;
                index++;
            }
        }
        for (int number : right) {
            repeat = false;
            for (int k = 0; k < index; k++) {
                if (rsl[k] == number) {
                    repeat = true;
                    break;
                }
            }
            if (!repeat) {
                rsl[index] = number;
                index++;
            }
        }
        return Arrays.copyOf(rsl, index);
    }
}
