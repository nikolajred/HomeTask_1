package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleArrayTest {

    @Test
    public void searchMultiplicityMembersOfArray() {
        MultipleArray multipleArray = new MultipleArray();
        int[]array = {2, 3, -8, 9, 22};
        int[] actual = multipleArray.searchMultiplicityMembersOfArray(array,2);
        int[]expected = {2, -8, 22};
        Assert.assertArrayEquals(actual, expected);

    }
}