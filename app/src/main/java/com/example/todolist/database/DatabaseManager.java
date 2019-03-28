package com.example.todolist.database;

import com.example.todolist.database.model.Task;

import java.util.List;

import io.realm.Realm;

public class DatabaseManager implements IDatabaseManager {
    private Realm realm;
    private static DatabaseManager dbManager;

    public DatabaseManager() {
        realm = Realm.getDefaultInstance();
    }

    public static DatabaseManager getDatabaseInstance() {
        if (dbManager == null) {
            dbManager = new DatabaseManager();
        }

        return dbManager;
    }

    @Override
    public List<Task> getTasks() {
        return realm.copyFromRealm(realm.where(Task.class).findAll());
    }

    @Override
    public void addTask(String title, String description) {
            Task task = new Task(title, description);

            int id;
            realm.beginTransaction();

            if (realm.where(Task.class).count() == 0) {
                id = 0;
            } else {
                id = realm.where(Task.class).max("id").intValue() + 1;
            }

            task.setId(id);

            realm.copyToRealm(task);
            realm.commitTransaction();
        }
    }

