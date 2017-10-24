package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bnmou on 10/24/2017.
 */
public class VectorHelperTest extends VectorHelper
{
    
    @Test
    public void testTrier() {
        Assert.assertArrayEquals(new int []{1,2,3,4,5,6},trier(new int []{3,2,1,4,6,5}));
    }
    @Test
    public void testMaxMib()
    {
        Assert.assertArrayEquals(new int[]{1, 34}, min_max(new int[]{3, 2, 1, 4, 6, 34}));
    }
    @Test
    public void testMultiplier()//test multiplication
    {
        Assert.assertArrayEquals(new int[]{2, 4, 6, 8, 10, 12}, multiplier(new int[]{1, 2, 3, 4, 5, 6},2));
    }
}
