package com.kodilla.kodillapatterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTest {

    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser walterWhite = new ForumUser("Walter White");
        ForumUser gustavoFring = new ForumUser("Hank Schroeder");
        ForumUser jessePinkman = new ForumUser("Jesse Pinkman");

        javaHelpForum.registerObserver(walterWhite);
        javaHelpForum.registerObserver(jessePinkman);
        javaToolsForum.registerObserver(gustavoFring);
        javaToolsForum.registerObserver(walterWhite);

        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case");
        javaToolsForum.addPost("Help pls, MySQL db doesn't work");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I got an error");

        //Then
        assertEquals(5,walterWhite.getUpdateCount());
        assertEquals(2,gustavoFring.getUpdateCount());
        assertEquals(3,jessePinkman.getUpdateCount());
    }

}