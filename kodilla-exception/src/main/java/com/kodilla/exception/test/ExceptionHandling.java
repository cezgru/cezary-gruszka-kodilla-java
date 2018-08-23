package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3, 1.5);
        } catch (Exception e){
            System.out.println("An error occured. Maybe try a different input?");
        } finally {
            System.out.println("Soooo we done?");
        }
    }
}
