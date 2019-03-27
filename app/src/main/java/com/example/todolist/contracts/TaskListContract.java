package com.example.todolist.contracts;

public interface TaskListContract {
    interface view{
        void initView();
        void navigateToAddNewTask();
    }

    interface presenter{
    void loadAddNewTask();
    }
}
