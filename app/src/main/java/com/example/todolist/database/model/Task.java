package com.example.todolist.database.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Task extends RealmObject {
    @PrimaryKey
    private int id;
    private String title;
    private String description;

    public Task (){}

    public Task (String title, String description){
        this.title = title;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

}
