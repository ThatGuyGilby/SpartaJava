package com.spartaglobal.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummerTest
{
    @Test
    public void testSumArrayNegative()
    {
        Summer summer = new Summer();

        System.out.println("Negative int test...");
        int[] negativeInts = {-1, -3, -6, -20, -1000};

        int actual = summer.sumArray(negativeInts);
        int expected = -1030;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumArrayPositive()
    {
        Summer summer = new Summer();

        System.out.println("Positive int test...");
        int[] positiveInts = {1, 3, 6, 20, 1000};

        int actual = summer.sumArray(positiveInts);
        int expected = 1030;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumArrayZero()
    {
        Summer summer = new Summer();

        System.out.println("Positive int test...");
        int[] positiveInts = {0};

        int actual = summer.sumArray(positiveInts);
        int expected = 0;

        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);

        Assertions.assertEquals(expected, actual);
    }
}
