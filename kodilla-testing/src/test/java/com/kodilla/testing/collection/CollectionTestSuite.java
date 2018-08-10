package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testEmptyList(){
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> emptyList = new ArrayList<>();

        numbers = exterminator.exterminate(numbers);

        Assert.assertEquals(emptyList, numbers);
    }

    @Test
    public void testMixedList(){
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<20; i++){
            numbers.add(i);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<10; i++)
            result.add(i*2);

        numbers = exterminator.exterminate(numbers);

        Assert.assertEquals(result, numbers);
    }


}
