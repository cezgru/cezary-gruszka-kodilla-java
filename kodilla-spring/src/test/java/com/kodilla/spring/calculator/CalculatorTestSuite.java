package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5;
        double b = 3;
        //Then
        Assert.assertEquals(8, calculator.add(a, b), 0.01);
    }

    @Test
    public void testSub(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5;
        double b = 3;
        //Then
        Assert.assertEquals(2, calculator.sub(a, b), 0.01);
    }

    @Test
    public void testMul(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5;
        double b = 3;
        //Then
        Assert.assertEquals(15, calculator.mul(a, b), 0.01);
    }

    @Test
    public void testDiv(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double a = 5;
        double b = 3;
        //Then
        Assert.assertEquals(1.666, calculator.div(a, b), 0.01);
    }
}
