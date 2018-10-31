package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testSaveSettings() {
        //Given
        //When
        Logger.getInstance().log("test");
        //Then
        Assert.assertEquals("test",Logger.getInstance().getLastLog());
    }
}