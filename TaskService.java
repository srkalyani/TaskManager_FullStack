package com.example.taskmanager.service;

import java.util.List;
import com.example.taskmanager.model.Task;
public interface TaskService {
    Task createTask(Task task);
    List<Task>getAllTasks();
    Task updateTask(String id,Task task);
    void deleteTask(String id);
}
