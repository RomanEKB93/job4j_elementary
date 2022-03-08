package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
    int rsl = -1;
    int count = 0;
    for (int i = 0; i < string.length; i++) {
        if (c == string[i]) {
             count++;
        }
        if (count == number) {
            rsl = i;
            break;
        }
    }
    return rsl;
    }
}
