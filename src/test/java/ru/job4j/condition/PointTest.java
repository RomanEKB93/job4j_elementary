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
    public void when000to236Then7() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(2, 3, 6);
        double expected = 7;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when123to321Then2Dot83() {
        Point first = new Point(1, 2, 3);
        Point second = new Point(3, 2, 1);
        double expected = 2.83;
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

}
