package com.kodilla.exception.test;

import java.sql.SQLOutput;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }



    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result;

        try {
            result = firstChallenge.divide(3,0);

        } catch (ArithmeticException e) {
            System.out.println("Hopefully you're working on the Riemann Sphere, sadly " +
                    "defining the complex infinity in basic java is rather hard. Returning pi, as it's " +
                    "just as valid as any other number in the reals. " +
                    "Please refrain from dividing by zero if possible. Error: " + e);
            result = Math.PI;

        } finally {
            System.out.println("Uhmm, good for you? Why is this even here I don't see much of a purpose for it" +
                    ", Kodilla pls. That aside, this doesn't even require an implementation. I mean" +
                    ", if you delete the if statement this code will literally just return " +
                    "infinity or -infinity, which is as close as it gets for real numbers, " +
                    "so why am I even implementing something here. Also, why I am writing comments" +
                    "as system output expressions is beyond me.");
        }

        System.out.println(result);

    }
}