package com.example.todolist.database;

import com.example.todolist.database.model.Task;

import java.util.List;

public interface IDatabaseManager {
    List<Task> getTasks();
    void addTask(String title, String description);

}
