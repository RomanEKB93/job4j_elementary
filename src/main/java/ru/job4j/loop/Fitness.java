package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        int ivanpull = ivan;
        int nikpull = nik;
        while (ivanpull <= nikpull) {
            ivanpull *= 3;
            nikpull *= 2;
            month++;
        }
        return month;
    }
}
