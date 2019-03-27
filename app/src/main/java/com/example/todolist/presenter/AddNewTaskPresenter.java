package com.example.todolist.presenter;

import com.example.todolist.contracts.AddNewTaskContract;

public class AddNewTaskPresenter implements AddNewTaskContract.presenter {
    private AddNewTaskContract.view view;
    public AddNewTaskPresenter(AddNewTaskContract.view view){

        this.view = view;
        initPresenter();
    }
    private void initPresenter() {
        view.initView();
    }
}
