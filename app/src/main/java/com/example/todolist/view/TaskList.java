package com.example.todolist.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.todolist.R;
import com.example.todolist.presenter.TaskListPresenter;
import com.example.todolist.view.AddNewTask;
import com.example.todolist.contracts.TaskListContract;

public class TaskList extends AppCompatActivity implements TaskListContract.view {
    Button AddNewTaskBtn;
    ListView TaskListLv;
    private TaskListContract.presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        presenter = new TaskListPresenter(this);
        AddNewTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadAddNewTask();
            }
        });
    }

    @Override
    public void initView() {
        TaskListLv = findViewById(R.id.taskListLv);
        AddNewTaskBtn = findViewById(R.id.addNewTaskBtn);

    }

    @Override
    public void navigateToAddNewTask() {
        Intent intent = new Intent(this, AddNewTask.class);
        startActivity(intent);
    }
}
