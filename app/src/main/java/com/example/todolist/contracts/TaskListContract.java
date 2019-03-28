package com.example.todolist.contracts;

import com.example.todolist.database.model.Task;

import java.util.List;

public interface TaskListContract {
    interface view{
        void initView();
        void navigateToAddNewTask();
        void showTasks(List<Task> taskList);
    }

    interface presenter{
    void loadAddNewTask();
    void setView();
    }
}
