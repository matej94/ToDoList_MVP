package com.example.todolist.ui.contracts;

public interface TaskListContract {
    interface view{
        void initView();
        void navigateToAddNewTask();
    }

    interface presenter{
    void loadAddNewTask();
    }
}
