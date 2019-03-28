package com.example.todolist.presenter;

import com.example.todolist.contracts.AddNewTaskContract;
import com.example.todolist.database.IDatabaseManager;

public class AddNewTaskPresenter implements AddNewTaskContract.presenter {
    private AddNewTaskContract.view view;
    private IDatabaseManager dbInterface;

    public AddNewTaskPresenter(AddNewTaskContract.view view, IDatabaseManager dbInterface){
        this.dbInterface = dbInterface;
        this.view = view;
        initPresenter();
    }
    private void initPresenter() {
        view.initView();
    }

    @Override
    public void addTaskClicked(String title, String description) {
        dbInterface.addTask(title, description);
    }
}
