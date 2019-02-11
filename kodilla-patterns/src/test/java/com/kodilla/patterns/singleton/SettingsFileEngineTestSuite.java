package com.kodilla.patterns.singleton;

import org.junit.*;

public class SettingsFileEngineTestSuite {

    @BeforeClass
    public static void openSettingsFile(){
        SettingsFileEngine.getInstance().open("myApp.settings");
    }

    @AfterClass
    public static void closeSettingsFile(){
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName(){

        String result = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened : " + result);

        Assert.assertEquals("myApp.settings",result);
    }

    @Test
    public void testLoadSettings(){

        boolean result = SettingsFileEngine.getInstance().loadSettings();

        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings(){

        boolean result = SettingsFileEngine.getInstance().saveSettings();

        Assert.assertTrue(result);
    }

}
