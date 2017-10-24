package com.company;

/**
 * Created by yesrefm on 24/10/2017.
 */
public class VectorException extends Exception {
    public VectorException()
    {
        System.out.println("La taille des deux vecteurs n'est pas egale");
    }
}