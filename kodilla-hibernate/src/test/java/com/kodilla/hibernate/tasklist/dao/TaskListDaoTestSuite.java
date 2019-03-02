package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;


    @Test
    public void testFindByListName(){

        TaskList taskList = new TaskList("FIRST","FirstList");
        taskListDao.save(taskList);

        List<TaskList> readTaskList = taskListDao.findByListName(taskList.getListName());
        //Optional<TaskList>readList1 = taskListDao.findByListName(taskList.getListName());

        Assert.assertEquals(1,readTaskList.size());

        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
