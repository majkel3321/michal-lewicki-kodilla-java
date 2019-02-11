package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void createLog(){
        Logger.getInstance().log("FirstLog");
    }

    @Test
    public void testGetLastLog(){

        String result = Logger.getInstance().getLastLog();
        Assert.assertEquals("FirstLog",result);

    }
}
