package com.example.todolist.ui.presenter;

import com.example.todolist.ui.contracts.TaskListContract;

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
