package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum1.CommentPostUser.ForumComment;
import com.kodilla.testing.forum1.CommentPostUser.ForumPost;
import com.kodilla.testing.forum1.CommentPostUser.ForumUser;
import org.junit.*;

//TestSuite for classes of Forum
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of all tests. ");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("This is the end of all tests.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        //When
        forumUser.addPost("mrsmith",
                "Hello everyone, this is my first contribution here!");

        //Then
        Assert.assertEquals(1, forumUser.getPostQuantity());

    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!",
                "mrsmith");

        //When
        forumUser.addComment(thePost, "mrsmith", "Thank you for all good words!");

        //Then
        Assert.assertEquals(1, forumUser.getCommentQuantity());
    }

    @Test
    public void testGetPost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!",
                "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        ForumPost receivedPost;
        receivedPost = forumUser.getPost(0);

        //Then
        Assert.assertEquals(thePost, receivedPost);

    }

    @Test
    public void testGetComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!",
                "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!", "mrsmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        ForumComment receivedComment = forumUser.getComment(0);

        //Then
        Assert.assertEquals(theComment, receivedComment);
    }

    @Test
    public void testRemovePostNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!",
                "mrsmith");

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void testRemoveCommentNotExisting() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, this is my first contribution here!",
                "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!",
                "mrsmith");

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemovePost() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        //When
        boolean result = forumUser.removePost(thePost);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getPostQuantity());

    }

    @Test
    public void testRemoveComment() {
        //Given
        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrsmith");
        ForumComment theComment = new ForumComment(thePost, "Thank you for all good words!",
                "mrsmith");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        //When
        boolean result = forumUser.removeComment(theComment);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, forumUser.getCommentQuantity());
    }


}
