package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {

    private int x;

    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double result = first.distance(second);
        System.out.println("result (0, 0) to (2, 0) is " + result);
        first = new Point(3, 8);
        second = new Point(-2, -6);
        result = first.distance(second);
        System.out.println("result (3, 8) to (-2, -6) is " + result);
    }
}
