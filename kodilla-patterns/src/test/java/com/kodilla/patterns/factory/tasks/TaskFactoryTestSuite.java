package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShop() {

        TaskFactory taskFactory = new TaskFactory();
        Task shopping = taskFactory.createTask(TaskFactory.SHOP);

        shopping.executeTask();


        Assert.assertEquals("Shop", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryDrive() {

        TaskFactory taskFactory = new TaskFactory();
        Task driving = taskFactory.createTask(TaskFactory.DRIVE);

        driving.executeTask();

        Assert.assertEquals("Drive", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPaint() {

        TaskFactory taskFactory = new TaskFactory();
        Task painting = taskFactory.createTask(TaskFactory.PAINT);

        painting.executeTask();

        Assert.assertEquals("Paint", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }
}
