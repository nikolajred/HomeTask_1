package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxOfArrayTest {

    @Test
    public void searchMin() throws Exception{
        MinMaxOfArray minOfArray = new MinMaxOfArray();
        int[]array = {5, 4, -9, 3, 0};
        int actual = minOfArray.searchMin(array);
        int expected = -9;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void searchMax() throws Exception{
        MinMaxOfArray maxOfArray = new MinMaxOfArray();
        int[]array = {5, 4, -9, 3, 0};
        int actual = maxOfArray.searchMax(array);
        int expected = 5;
        Assert.assertEquals(expected, actual);

    }
}