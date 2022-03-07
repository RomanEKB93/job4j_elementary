package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
       boolean downShift = true;
       boolean leftShift = true;
       boolean rightShift = true;
       boolean upShift = true;
       if (row == 0) {
           upShift = false;
       }
        if (column == 0) {
            leftShift = false;
        }
        if (row == array.length - 1) {
            downShift = false;
        }
        if (column == array[0].length - 1) {
            rightShift = false;
        }
        if (upShift) {
            for (int i = 0; i <= row - 1; i++) {
                array[i][column] = array[i + 1][column];
            }
        }
        if (downShift) {
            for (int i = 0; i < array.length - row - 1; i++) {
                array[array.length - 1 - i][column] = array[array.length - 2 - i][column];
            }
        }
        if (leftShift) {
            for (int j = 0; j <= column - 1; j++) {
                array[row][j] = array[row][j + 1];
            }
        }
        if (rightShift) {
            for (int j = 0; j < array[0].length - column - 1; j++) {
                array[row][array[0].length - 1 - j] = array[row][array[0].length - 2 - j];
            }
        }
        array[row][column] = 0;
    }

}
