package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevePost = steven.share();
        String johnPost = john.share();
        String kodillaPost = kodilla.share();

        //Then
        Assert.assertEquals("Using Facebook", stevePost);
        Assert.assertEquals("Using Snapchat", johnPost);
        Assert.assertEquals("Using Twitter", kodillaPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenPost = steven.share();
        System.out.println("Steve cmon man. " + stevenPost +"?");
        steven.setSocialPublisher(new TwitterPublisher());
        stevenPost = steven.share();

        //Then
        Assert.assertEquals("Using Twitter", stevenPost);
    }
}
