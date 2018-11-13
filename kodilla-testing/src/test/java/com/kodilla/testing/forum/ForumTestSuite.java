package com.kodilla.testing.forum;
import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {

    @Before        //uruchamia sie przed kazdym testem jednostkowym
    public void before(){
        System.out.println("Test case: begin");
    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @BeforeClass
    public static void beforeClass(){        //uruchamia sie jednorazowo przed wykonaniem wyszstkich przypadkow testowych
        System.out.println("Test suite: begin");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test suite: end");
    }

    @Test
    public void testCaseUsername(){

        //Given or Arrange (Zakładając że... lub Przygotuj)
        SimpleUser simpleUser = new SimpleUser("theForumUser","John Smith");

        //When or Act (Kiedy... lub Działaj)
        String result = simpleUser.getUsername();
        System.out.println("Testing1 " + result);

        //Then or Assert (Wtedy... lub Zapewnij)
        Assert.assertEquals("theForumUser",result);     //Assert.assertEquals(String expected, String actual)

    }

    @Test
    public void testCaseRealname(){

        SimpleUser simpleUser = new SimpleUser("theForumUser","John Smith");

        String result = simpleUser.getRealname();
        System.out.println("Testing " + result);

        Assert.assertEquals("John Smith",result);
    }


}
