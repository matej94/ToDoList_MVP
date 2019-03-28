package com.example.todolist.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.todolist.R;
import com.example.todolist.database.DatabaseManager;
import com.example.todolist.database.model.Task;
import com.example.todolist.presenter.TaskListPresenter;
import com.example.todolist.contracts.TaskListContract;
import com.example.todolist.view.adapter.TaskListAdapter;

import java.util.List;

public class TaskList extends AppCompatActivity implements TaskListContract.view {
    Button AddNewTaskBtn;
    ListView TaskListLv;
    private TaskListContract.presenter presenter;
    TaskListAdapter taskListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        presenter = new TaskListPresenter(this, DatabaseManager.getDatabaseInstance());
    }

    @Override
    protected void onResume() {
        super.onResume();

        presenter.setView();
    }

    @Override
    public void initView() {
        TaskListLv = findViewById(R.id.taskListLv);
        AddNewTaskBtn = findViewById(R.id.addNewTaskBtn);
        AddNewTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadAddNewTask();
            }
        });
    }

    @Override
    public void navigateToAddNewTask() {
        Intent intent = new Intent(this, AddNewTask.class);
        startActivity(intent);
    }

    @Override
    public void showTasks(List<Task> taskList) {
        taskListAdapter= new TaskListAdapter(this,taskList);
        TaskListLv .setAdapter(taskListAdapter);    }
}
