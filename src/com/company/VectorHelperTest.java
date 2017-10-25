package com.company;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by bnmou on 10/24/2017.
 */
public class VectorHelperTest extends VectorHelper
{
	 /**
     * Test de la focntion inverse
     */
     @Test
    public void testInversse()
    {
        Assert.assertArrayEquals(new int []{6,5,4,3,2,1},invers(new int []{1,2,3,4,5,6}));
    }
	 /**
     * Test de la fonction Somme
     */
    @Test
    public void testSomme() {
        Assert.assertArrayEquals(new int []{2,4,6,8,10,12},somme(new int []{1,2,3,4,5,6},new int []{1,2,3,4,5,6}));}  
		
		 /**
     * Test de la fonction Trier
     */
	 
    @Test
    public void testTrier() {
        Assert.assertArrayEquals(new int []{1,2,3,4,5,6},trier(new int []{3,2,1,4,6,5}));
    }
	
	  /**
     * Test de la fonction max_min
     */
    @Test
    public void testMaxMin()
    {
        Assert.assertArrayEquals(new int[]{1, 34}, min_max(new int[]{3, 2, 1, 4, 6, 34}));
    }
	/**
     * Test de la fonction multiplier
     */
    @Test
    public void testMultiplier()
    {
        Assert.assertArrayEquals(new int[]{2, 4, 6, 8, 10, 12}, multiplier(new int[]{1, 2, 3, 4, 5, 6},2));
    }
}
