package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To5Then8() {
        int left = 8;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To10Then10() {
        int left = 5;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int left = 1;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax12To5ToMinus1Then12() {
        int first = 12;
        int second = 5;
        int third = -1;
        int result = Max.max(first, second, third);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax23ToMinus5To84To73Then84() {
        int first = 23;
        int second = -5;
        int third = 84;
        int fourth = 73;
        int result = Max.max(first, second, third, fourth);
        int expected = 84;
        Assert.assertEquals(result, expected);
    }
}