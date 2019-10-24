package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedArrayTest {

    @Test
    public void sortBubbles() {
        SortedArray sortedArray = new SortedArray();
        int[]testArray = {2, 5, 3, 8, -2};
        int[] actuals = sortedArray.sortBubbles(testArray);
        int[] expecteds = {-2, 2, 3, 5, 8};
        Assert.assertArrayEquals(expecteds, actuals);
    }
}