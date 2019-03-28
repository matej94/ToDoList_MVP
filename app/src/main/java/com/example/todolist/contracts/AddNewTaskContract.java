package com.example.todolist.contracts;

public interface AddNewTaskContract {
    interface view{
        void initView();
    }

    interface presenter{
        void addTaskClicked(String title, String description);

    }

}
