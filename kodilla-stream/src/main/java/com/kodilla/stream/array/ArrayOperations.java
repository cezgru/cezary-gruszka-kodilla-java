package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){
       IntStream.range(0,numbers.length-1)
              .forEach(n -> System.out.println(numbers[n]));

       OptionalDouble result = IntStream.range(0,numbers.length)
               .map(n -> numbers[n])
               .average();

       double resultDouble = result.getAsDouble();
       return resultDouble;
    }
}
