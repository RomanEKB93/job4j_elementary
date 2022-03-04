package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
    int rsl = 1;
    int sequenceLength = 1;
    for (int i = 1; i < array.length; i++) {
        if (array[i] >= array[i - 1]) {
            sequenceLength++;
        } else {
            if (sequenceLength > rsl) {
                rsl = sequenceLength;
            }
            sequenceLength = 1;
        }
    }
        if (sequenceLength > rsl) {
            rsl = sequenceLength;
        }
    return rsl;
    }
}
