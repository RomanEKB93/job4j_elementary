package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when30to04Then5() {
        Point first = new Point(3, 0);
        Point second = new Point(0, 4);
        double expected = 5;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to512Then13() {
        Point first = new Point(0, 0);
        Point second = new Point(5, 12);
        double expected = 13;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to43Then4dot47() {
        Point first = new Point(0, 1);
        Point second = new Point(4, 3);
        double expected = 4.47;
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}
