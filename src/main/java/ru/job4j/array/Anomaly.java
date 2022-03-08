package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int index0 = 0;
        int index1 = 0;
        for (int i = 0; i < data.length; i++) {
            if ((i > 0 && data[i - 1] > down && data[i - 1] < up
                    && (data[i] <= down || data[i] >= up)) || (i == 0 && (data[i] <= down || data[i] >= up))) {
                index0 = i;
                count++;
                while ((i < data.length - 2 && (data[i + 1] <= down || data[i + 1] >= up))
                        || (i == result.length - 2 && (data[i + 1] <= down || data[i + 1] >= up))) {
                    i++;
                }
                if (i - index0 + 1 > 1) {
                    result[index1] = new int[i - index0 + 1];
                    for (int j = 0; j < result[index1].length; j++) {
                        result[index1][j] = j + index0;
                    }
                } else {
                    result[index1] = new int[]{index0, index0};
                }
                     index1++;
                }
        }
        return Arrays.copyOf(result, count);
    }
}
