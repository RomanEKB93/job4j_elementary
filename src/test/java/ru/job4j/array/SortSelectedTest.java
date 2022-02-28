package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {
        @Test
        public void whenSortArrayOf5elements() {
            int[] data = new int[] {3, 4, 1, 2, 5};
            int[] result = SortSelected.sort(data);
            int[] expected = new int[] {1, 2, 3, 4, 5};
            Assert.assertArrayEquals(expected, result);
        }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {1, 14, -3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-3, 1, 14};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf7elements() {
        int[] data = new int[] {3, 7, 11, -5, 9, 21, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-5, 0, 3, 7, 9, 11, 21};
        Assert.assertArrayEquals(expected, result);
    }

}