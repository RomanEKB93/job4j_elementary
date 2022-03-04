package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
    int rsl = -1;
    int countC = 0;
    for (int i = 0; i < string.length; i++) {
        if (c == string[i]) {
             countC++;
        }
        if (countC == number) {
            rsl = i;
            break;
        }
    }
    return rsl;
    }
}
