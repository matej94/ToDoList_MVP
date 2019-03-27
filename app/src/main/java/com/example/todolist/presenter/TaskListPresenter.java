package com.example.todolist.presenter;

import com.example.todolist.contracts.TaskListContract;

public class TaskListPresenter implements TaskListContract.presenter {
    private TaskListContract.view view;
    public TaskListPresenter(TaskListContract.view view){
        this.view = view;
        initPresenter();
    }
    private void initPresenter() {
        view.initView();
    }
    @Override
    public void loadAddNewTask() {
        view.navigateToAddNewTask();

    }
}
