package com.example.todolist.ui.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.todolist.R;
import com.example.todolist.ui.presenter.AddNewTaskPresenter;
import com.example.todolist.ui.contracts.AddNewTaskContract;

public class AddNewTask extends AppCompatActivity implements AddNewTaskContract.view {
    EditText TitleEt, DescriptionEt;
    Button AddTaskBtn;
    private AddNewTaskContract.presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_task);
        presenter = new AddNewTaskPresenter(this);
    }

    @Override
    public void initView() {
        TitleEt = findViewById(R.id.titleEt);
        DescriptionEt = findViewById(R.id.descriptionEt);
        AddTaskBtn = findViewById(R.id.addTaskBtn);
    }
}