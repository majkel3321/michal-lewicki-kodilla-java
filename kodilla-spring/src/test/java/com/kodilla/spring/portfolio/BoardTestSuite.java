package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)


public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.addToDoList("task1");
        board.addInProgressList("task2");
        board.addDoneList("task3");


        Assert.assertFalse(board.getToDoList().getTasks().isEmpty());
        Assert.assertFalse(board.getInProgressList().getTasks().isEmpty());
        Assert.assertFalse(board.getDoneList().getTasks().isEmpty());


    }


}
