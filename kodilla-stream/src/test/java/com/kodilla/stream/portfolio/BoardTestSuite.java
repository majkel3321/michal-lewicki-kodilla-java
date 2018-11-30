package com.kodilla.stream.portfolio;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class BoardTestSuite {

    public Board prepareTestData(){

        //Users
        User user1 = new User("developer1","John Smith");
        User user2 = new User("projectmanager1","Nina White");
        User user3 = new User("developer2","Emilia Stephanson");
        User user4 = new User("developer3","Konrad Bridge");

        //Tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking the temperature from external device",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));

        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQLs queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));

        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));

        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));

        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //TasksList
        TaskList taskListToDo = new TaskList("to do");

        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);

        TaskList taskListInProgress = new TaskList("In progress");

        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);

        TaskList taskListDone = new TaskList("Done");

        taskListDone.addTask(task6);

        //Board
        Board project = new Board("Project Weather Prediction");

        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);

        return project;

    }



    @Test
    public void testAddTaskList(){

        Board project = prepareTestData();

        Assert.assertEquals(3,project.getTaskList().size());
    }

    @Test
    public void testAddTaskListFindUserTasks(){

        //Given
        Board project = prepareTestData();

        //When
        User user = new User("developer1","John Smith");

        List<Task> tasks = project.getTaskList().stream()
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getAssignedUser().equals(user))
                .collect(toList());

        Assert.assertEquals(2,tasks.size());
        Assert.assertEquals(user,tasks.get(0).getAssignedUser());
        Assert.assertEquals(user,tasks.get(1).getAssignedUser());




    }

    @Test
    public void testAddTaskListFindOutdatedTask(){

        Board project = prepareTestData();

        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));

        List<Task> tasks = project.getTaskList().stream()
                .filter(undoneTasks::contains)
                .flatMap(t -> t.getTasks().stream())
                .filter(l -> l.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());

        Assert.assertEquals(1,tasks.size());
        Assert.assertEquals("HQLs for analysis",tasks.get(0).getTitle());
    }

    @Test
    public void testAddTaskListFindLongTasks(){

        Board project = prepareTestData();

        List<TaskList> tasksInProgress = new ArrayList<>();
        tasksInProgress.add(new TaskList("In progress"));

        long longTasks = project.getTaskList().stream()
                .filter(tasksInProgress::contains)
                .flatMap(t -> t.getTasks().stream())
                .map(l -> l.getCreated())
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();

        Assert.assertEquals(2,longTasks);



    }

    @Test
    public void testAddTaskListAverageWorkingOnTask(){

        Board project = prepareTestData();

        List<TaskList> tasksInProgress = new ArrayList<>();
        tasksInProgress.add(new TaskList("In progress"));

        double average = project.getTaskList().stream()
                .filter(tasksInProgress::contains)
                .flatMap(t -> t.getTasks().stream())
                .mapToInt(l -> Period.between(l.getCreated(),LocalDate.now()).getDays())
                .average().getAsDouble();

        Assert.assertEquals(10.0,average,0.01);







    }


}
