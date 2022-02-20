package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double action1 = x2 - x1;
        double action2 = y2 - y1;
        double action3 = Math.pow(action1, 2);
        double action4 = Math.pow(action2, 2);
        double action5 = action3 + action4;
        double rsl = Math.sqrt(action5);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) is " + result);
        result = Point.distance(3, 8, -2, -6);
        System.out.println("result (3, 8) to (-2, -6) is " + result);
    }
}
