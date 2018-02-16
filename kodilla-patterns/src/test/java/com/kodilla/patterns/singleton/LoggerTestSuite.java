package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLogTest() {
        //Given
        Logger.getInstance().log("lastLog");
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("lastLog", lastLog);
    }
}
