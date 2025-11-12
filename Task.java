package com.example.taskmanager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="tasks")
public class Task {

    @Id
    private String id;
    private String title;
    private boolean completed = false;

    // No-arg constructor
    public Task() {}

    // All-arg constructor
    public Task(String id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    // Getters
    public String getId() { return id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
