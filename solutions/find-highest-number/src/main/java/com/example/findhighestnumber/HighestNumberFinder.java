package com.example.findhighestnumber;

public  class HighestNumberFinder implements IHighestNumberFinder
{
   @Override
    public int findHighestNumber(int[] array)
    {
        int highestSoFar = Integer.MIN_VALUE;
        
        for( int val : array )
        {
            if( val > highestSoFar )
                highestSoFar = val;
        }
        return highestSoFar;
    }    
}
