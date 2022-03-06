package ru.job4j.array;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length][];
        int commonCount = 0;
        int previousDelimiterIndex = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                result[commonCount] = new char[i - previousDelimiterIndex];
                for (int j = 0; j < result[commonCount].length; j++) {
                    result[commonCount][j] = str[j + previousDelimiterIndex];
                }
                while (str[i] == c) {
                    i++;
                }
                previousDelimiterIndex = i;
                commonCount++;
            }
        }
        result[commonCount] = new char[str.length - previousDelimiterIndex];
        for (int j = 0; j < result[commonCount].length; j++) {
            result[commonCount][j] = str[j + previousDelimiterIndex];
        }
        commonCount++;
        return Arrays.copyOf(result, commonCount);
    }
}
