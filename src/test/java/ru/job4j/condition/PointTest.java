package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when30to04Then5() {
        int x1 = 3;
        int y1 = 0;
        int x2 = 0;
        int y2 = 4;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to512Then13() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 12;
        double expected = 13;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to43Then4dot4721359() {
        int x1 = 0;
        int y1 = 1;
        int x2 = 4;
        int y2 = 3;
        double expected = 4.4721359;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
