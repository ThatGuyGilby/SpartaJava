package com.spartaglobal.configtest.basics;

public class Summer
{
    public static void main(String[] args)
    {

    }

    public int sumArray(int[] theInts)
    {
        int sum = 0;

        for (int x : theInts)
        {
            sum += x;
        }

        return sum;
    }
}
