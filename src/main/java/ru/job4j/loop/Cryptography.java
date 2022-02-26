package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        int slength = s.length();
        if (slength == 0) {
            s = "empty";
        } else if (slength > 4) {
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < slength - 4; i++) {
                sb.setCharAt(i, '#');
            }
            s = sb.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(code("Привет, как дела?"));
        System.out.println(code(""));
        System.out.println(code("как дела"));
    }
}
