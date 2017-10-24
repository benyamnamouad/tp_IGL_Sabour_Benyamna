package com.company;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by yesrefm on 22/10/2017.
 */
public class VectorHelper
{
/**
     * verfier si deux vecteurr ont la meme taille
     * @param vector1 le 1er vecteur
     * @param vector2 le 2eme vecteur
     * @throws VectorException l'exception qui declanch lorsque deux vecteurs ont la meme taille
     */

    private void verfVector(int [] vector1,int [] vector2 ) throws VectorException
    {
        if(vector1.length!=vector2.length) throw new VectorException();
    }

    /**
     * la somme de deux vecterus
     * @param vector1 le 1er vecteur
     * @param vector2 le 2eme vecteur
     * @return vecteur somme des deux vecteurs parametre
     */
    public int [] somme(int [] vector1,int [] vector2)
    {

        int [] somme=new int[vector1.length];
        try {
            verfVector(vector1,vector2);

            for(int i=0;i<vector1.length;i++)
            {
                somme[i]=vector1[i]+vector2[i];
            }
        }
        catch (VectorException e)
        {
            e.printStackTrace();
        }
        return somme;

    }

    /**
     * inverser un vecteur
     * @param vector le vecteur qu'on veut inverser
     * @return le vecteur inverse de vecteur entrée
     */
    public int []  invers(int [] vector)
    {
        int [] result= new int[vector.length];
        int j=0;
        for(int i=vector.length-1;i>=0;i--)
        {
            result[j]=vector[i];
            j++;
        }
        return result;
    }

    public int[] trier ( int [] vector){


        for (int i=vector.length-1;i>=1;i--){
            for (int j=0;j<=i-1;j++){
                if(vector[j+1]<vector[j]){

                    int swap = vector[j];
                    vector[j] =vector[j+1];
                    vector[j+1]= swap ;

                }
            }
        }

        return vector ;

    }

   
 
    public int []  min_max(int [] vect)
    {
        int [] result=new int[2];
        int min= vect[0];
        int max= vect[0];
        int i=1;
        while(i<vect.length)
        {
            if(min>vect[i])    min=vect[i];
            i++;
        }
        i=1;
        while(i<vect.length) {
            if (max < vect[i]) max = vect[i];
            i++;
        }
        result[0]=min;
        result[1]=max;
      return result;
    }

   
    public  int [] multiplier(int [] vect, int k)
    {
        for(int i=0;i<vect.length;i++)
        {
            vect[i]*=k;
        }
        return vect;
    }


}


