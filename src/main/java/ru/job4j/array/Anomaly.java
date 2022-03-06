package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int anomalyStartIndex = 0;
        int rslIndex = 0;
        for (int i = 0; i < data.length; i++) {
            if ((i > 0 && data[i - 1] > down && data[i - 1] < up
                    && (data[i] <= down || data[i] >= up)) || (i == 0 && (data[i] <= down || data[i] >= up))) {
                anomalyStartIndex = i;
                count++;
                while ((i < data.length - 2 && (data[i + 1] <= down || data[i + 1] >= up))
                        || (i == result.length - 2 && (data[i + 1] <= down || data[i + 1] >= up))) {
                    i++;
                }
                if (i - anomalyStartIndex + 1 > 1) {
                    result[rslIndex] = new int[i - anomalyStartIndex + 1];
                    for (int j = 0; j < result[rslIndex].length; j++) {
                        result[rslIndex][j] = j + anomalyStartIndex;
                    }
                } else {
                    result[rslIndex] = new int[]{anomalyStartIndex, anomalyStartIndex};
                }
                     rslIndex++;
                }

        }
        return Arrays.copyOf(result, count);
    }
}
