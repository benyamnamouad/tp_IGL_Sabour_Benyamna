package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bnmou on 10/24/2017.
 */
public class VectorHelperTest extends VectorHelper
{
    @Test
    public void testInversse()
    {
        Assert.assertArrayEquals(new int []{6,5,4,3,2,1},invers(new int []{1,2,3,4,5,6}));
    }
    @Test
    public void testSomme() {
        Assert.assertArrayEquals(new int []{2,4,6,8,10,12},somme(new int []{1,2,3,4,5,6},new int []{1,2,3,4,5,6}));}
