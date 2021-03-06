package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumTestSuite {

    @Test
    public void testUsersNames() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        users.add("czlowiek");

        when(statisticsMock.usersNames()).thenReturn(users);
        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(1, calculate.usersNames().size());
    }


    @Test
    public void testPostsCount() {
        Statistics statisticsMock = mock(Statistics.class);

        int postsNumber = 100;

        when(statisticsMock.postsCount()).thenReturn(postsNumber);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(100, calculate.postsCount);
    }


    @Test
    public void testAveragePostsZero() {

        Statistics statisticsMock = mock(Statistics.class);

        int postsNumber = 0;
        int commentsNumber = 1;
        List<String> usersList = new ArrayList<>();
        usersList.add("Adam Nawałka");

        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);


        Assert.assertEquals(0, calculate.averagePostsPerUser, 0.001);
        Assert.assertEquals(0, calculate.averageCommentsPerPost, 0.001);
        Assert.assertEquals(1, calculate.averageCommentsPerUser, 0.001);
    }

    @Test
    public void testAveragePosts() {

        Statistics statisticsMock = mock(Statistics.class);

        int postsNumber = 100;
        int commentsNumber = 500;
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            usersList.add("Adam Smith");
        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(2, calculate.averagePostsPerUser, 0.001);
        Assert.assertEquals(5, calculate.averageCommentsPerPost, 0.001);
        Assert.assertEquals(10, calculate.averageCommentsPerUser, 0.001);

    }

    @Test
    public void testAverageCommentsZero() {

        Statistics statisticsMock = mock(Statistics.class);

        int commentsNumber = 0;
        int postsNumber = 100;
        List<String> usersList = new ArrayList<>();
        usersList.add("John Smith");

        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, calculate.averageCommentsPerPost, 0.001);
        Assert.assertEquals(0, calculate.averageCommentsPerUser, 0.001);
        Assert.assertEquals(100, calculate.averagePostsPerUser, 0.001);

    }

    @Test
    public void testAverageComments() {

        Statistics statisticsMock = mock(Statistics.class);

        int commentsNumber = 100;
        int postsNumber = 50;
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            usersList.add("John Smith");
        }

        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(5, calculate.averageCommentsPerUser, 0.001);
        Assert.assertEquals(2, calculate.averageCommentsPerPost, 0.001);
        Assert.assertEquals(2.5, calculate.averagePostsPerUser, 0.001);
    }

    @Test
    public void testAverageMorePostsThenPosts() {

        Statistics statisticsMock = mock(Statistics.class);

        int postsNumber = 1000;
        int commentsNumber = 200;
        List<String> usersList = new ArrayList<>();
        usersList.add("John Doe");

        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0.2, calculate.averageCommentsPerPost, 0.001);
        Assert.assertEquals(200, calculate.averageCommentsPerUser, 0.001);
        Assert.assertEquals(1000, calculate.averagePostsPerUser, 0.001);
    }

    @Test
    public void testAverageMoreCommentsThenPosts() {

        Statistics statisticsMock = mock(Statistics.class);

        int postsNumber = 200;
        int commentsNumber = 1000;
        List<String> usersList = new ArrayList<>();
        usersList.add("John Doe");

        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(5, calculate.averageCommentsPerPost, 0.001);
        Assert.assertEquals(1000, calculate.averageCommentsPerUser, 0.001);
        Assert.assertEquals(200, calculate.averagePostsPerUser, 0.001);
    }

    @Test
    public void testAverageZeroUsers() {

        Statistics statisticsMock = mock(Statistics.class);

        int postsNumber = 200;
        int commentsNumber = 1000;
        List<String> usersList = new ArrayList<>();


        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, calculate.averageCommentsPerUser, 0.001);
        Assert.assertEquals(5, calculate.averageCommentsPerPost, 0.001);
        Assert.assertEquals(0, calculate.averagePostsPerUser, 0.001);


    }

    @Test
    public void testAverageUsers() {

        Statistics statisticsMock = mock(Statistics.class);

        int postsNumber = 1000;
        int commentsNumber = 1000;
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("John Doe");
        }


        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        when(statisticsMock.usersNames()).thenReturn(usersList);

        Calculate calculate = new Calculate();
        calculate.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(10, calculate.averageCommentsPerUser, 0.001);
        Assert.assertEquals(1, calculate.averageCommentsPerPost, 0.001);
        Assert.assertEquals(10, calculate.averagePostsPerUser, 0.001);

    }

    @Test
    public void testAverageAge() {

        List<Person> theList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            theList.add(new Person("adam", "smith", i * 10));
        }

        List<Person> secondList = new ArrayList<>();
        secondList.add(new Person("adam", "smith", 55));


        Calculate calculate = new Calculate();


        Assert.assertEquals(45, calculate.calculateAverageAge(theList), 0.001);
        Assert.assertEquals(55, calculate.calculateAverageAge(secondList), 0.001);


    }


}
