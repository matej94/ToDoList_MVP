package com.example.todolist.presenter;

import com.example.todolist.contracts.TaskListContract;
import com.example.todolist.database.IDatabaseManager;
import com.example.todolist.database.model.Task;

import java.util.List;

public class TaskListPresenter implements TaskListContract.presenter {
    private TaskListContract.view view;
    private IDatabaseManager dbInterface;
    private List<Task> taskList;
    public TaskListPresenter(TaskListContract.view view,IDatabaseManager dbInterface){
        this.dbInterface = dbInterface;
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

    @Override
    public void setView() {
        fetchTasks();
    }
    private void fetchTasks(){
        taskList = dbInterface.getTasks();
        view.showTasks(taskList);
    }
}
