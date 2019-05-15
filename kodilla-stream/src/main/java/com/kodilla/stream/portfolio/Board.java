package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {

    private final List<TaskList> taskList = new ArrayList<>();
    private final String name;

    public Board(final String name) {
        this.name = name;
    }

    public void addTaskList(TaskList tasklist) {
        taskList.add(tasklist);
    }

    public boolean removeTaskList(TaskList tasklist) {
        return taskList.remove(tasklist);
    }

    public List<TaskList> getTaskList() {
        return new ArrayList<>(taskList);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Board{" +
                "taskList=" + taskList +
                ", name='" + name + '\'' +
                '}';
    }
}

