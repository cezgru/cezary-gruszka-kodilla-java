package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.MathExpression;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10,5, (a,b)->a+b);
        expressionExecutor.executeExpression(10,5, (a,b)->a-b);
        expressionExecutor.executeExpression(10,5, (a,b)->a*b);
        expressionExecutor.executeExpression(10,5, (a,b)->a/b);

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("This is a text", text -> text+"ABCD"));
        System.out.println(poemBeautifier.beautify("this is a text", String::toUpperCase));
        System.out.println(poemBeautifier.beautify("this is a text", String::toLowerCase));
        System.out.println(poemBeautifier.beautify("this is a text", text -> text+" i don't know"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
