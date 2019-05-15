package com.kodilla.patterns.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        User brian = new Millenials("Brian Kowalski");
        User jessica = new YGeneration("Jessica Nunez");
        User mark = new ZGeneration("Mark Knopfler");

        String brianPost = brian.sharePost();
        String jessicaPost = jessica.sharePost();
        String markPost = mark.sharePost();

        System.out.println("Brian is using " + brianPost);
        System.out.println("Jessica is using " + jessicaPost);
        System.out.println("Mark is using " + markPost);

        Assert.assertEquals("Snapchat", brianPost);
        Assert.assertEquals("Twitter", jessicaPost);
        Assert.assertEquals("Facebook", markPost);


    }

    @Test
    public void testIndividualSharingStrategies() {

        User mark = new YGeneration("Mark Knopfler");

        String markPost = mark.sharePost();
        System.out.println("Mark is using " + markPost);

        mark.setSocialPublisher(new FacebookPublisher());

        markPost = mark.sharePost();
        System.out.println("Now Mark is using " + markPost);

        Assert.assertEquals("Facebook", markPost);
    }
}
