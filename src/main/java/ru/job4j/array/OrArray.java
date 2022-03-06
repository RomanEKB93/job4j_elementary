package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int rslIndex = 0;
        for (int number : left) {
            boolean hasrepeat = false;
            for (int k = 0; k < rslIndex; k++) {
                if (rsl[k] == number) {
                hasrepeat = true;
                break;
                }
            }
            if (!hasrepeat) {
                rsl[rslIndex] = number;
                rslIndex++;
            }
        }
        for (int number : right) {
            boolean hasrepeat = false;
            for (int k = 0; k < rslIndex; k++) {
                if (rsl[k] == number) {
                    hasrepeat = true;
                    break;
                }
            }
            if (!hasrepeat) {
                rsl[rslIndex] = number;
                rslIndex++;
            }
        }
        return Arrays.copyOf(rsl, rslIndex);
    }
}
