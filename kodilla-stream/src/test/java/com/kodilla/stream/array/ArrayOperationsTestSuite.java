package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[]{2, 4, 6, 7, 13, 21};


        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(8.83, result, 0.01);
    }
}
