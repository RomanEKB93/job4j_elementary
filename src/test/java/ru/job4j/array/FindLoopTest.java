package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = {54, 25, 7, 13, 92, 38};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas92Then4() {
        int[] data = {54, 25, 7, 13, 92, 38};
        int el = 92;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}