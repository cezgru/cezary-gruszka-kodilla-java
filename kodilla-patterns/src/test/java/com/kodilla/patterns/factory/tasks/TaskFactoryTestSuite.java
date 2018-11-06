package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask("SHOPPING");
        shopping.executeTask();
        String name = shopping.getTaskName();

        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
        Assert.assertEquals("dunno", name);

    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask("PAINTING");
        painting.executeTask();
        String name = painting.getTaskName();
        //Then
        Assert.assertTrue(painting.isTaskExecuted());
        Assert.assertEquals("really though", name);

    }

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask("DRIVING");
        driving.executeTask();
        String name = driving.getTaskName();

        //Then
        Assert.assertTrue(driving.isTaskExecuted());
        Assert.assertEquals("initial d", name);
    }
}
