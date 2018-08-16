package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.Mockito;

public class StatisticsTestSuite {

    @Test
    public void TestUserCount(){
        //Given
        List<String> namesList = new ArrayList<>();
        for(int i=0; i<100; i++){
            namesList.add("" + i);
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(namesList);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100 ,statisticsCalculator.getUserCount());
    }

    @Test
    public void TestPostCount(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0 ,statisticsCalculator.getPostCount());
    }

    @Test
    public void TestCommentCount(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0 ,statisticsCalculator.getCommentCount());
    }

    @Test
    public void TestAveragePostsPerUser(){
        //Given
        List<String> namesList = new ArrayList<>();
        for(int i=0; i<100; i++){
            namesList.add("" + i);
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(namesList);
        when(statisticsMock.postsCount()).thenReturn(30);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.3 ,statisticsCalculator.getAveragePostsPerUser(), 0.1);
    }

    @Test
    public void TestAverageCommentsPerUser(){
        //Given
        List<String> namesList = new ArrayList<>();
        for(int i=0; i<100; i++){
            namesList.add("" + i);
        }
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(30);
        when(statisticsMock.usersNames()).thenReturn(namesList);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.33 ,statisticsCalculator.getAverageCommentsPerUser(), 0.1);
    }
    @Test

    public void TestAverageCommentsPerPost(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();

        //When
        when(statisticsMock.commentsCount()).thenReturn(30);
        when(statisticsMock.postsCount()).thenReturn(20);
        statisticsCalculator.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(1.5 ,statisticsCalculator.getAverageCommentsPerPost(), 0.1);
    }
}

