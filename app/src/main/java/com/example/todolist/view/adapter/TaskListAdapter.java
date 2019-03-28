package com.example.todolist.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.todolist.R;
import com.example.todolist.database.model.Task;

import java.util.List;

public class TaskListAdapter extends ArrayAdapter<Task> {

    private Context mContext;

    public TaskListAdapter(Context context, List<Task> tasks) {
        super(context, 0, tasks);
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View taskItem = convertView;

        if (taskItem == null) {
            taskItem = LayoutInflater.from(mContext).inflate(R.layout.task_item,parent,false);
        }

        Task task = getItem(position);

        if (task != null) {
            TextView TitleTv = taskItem.findViewById(R.id.titleTv);
            TextView DescriptionTv = taskItem.findViewById(R.id.descriptionTv);
            TextView IDTv = taskItem.findViewById(R.id.idTv);

            if (TitleTv != null) {
                TitleTv.setText(task.getTitle());
            }

            if (DescriptionTv != null) {
                DescriptionTv.setText(task.getDescription());
            }
            if (IDTv != null) {
                IDTv.setText(((Integer.toString(task.getId()))));
            }
        }
        return taskItem;
    }
}
