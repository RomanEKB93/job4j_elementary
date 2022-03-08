package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length][];
        int count = 0;
        int previous = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                result[count] = new char[i - previous];
                for (int j = 0; j < result[count].length; j++) {
                    result[count][j] = str[j + previous];
                }
                while (str[i] == c) {
                    i++;
                }
                previous = i;
                count++;
            }
        }
        result[count] = new char[str.length - previous];
        for (int j = 0; j < result[count].length; j++) {
            result[count][j] = str[j + previous];
        }
        count++;
        return Arrays.copyOf(result, count);
    }
}
