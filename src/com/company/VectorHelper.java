package com.company;

import org.junit.Assert;
import org.junit.Test;


public class VectorHelper
{

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

