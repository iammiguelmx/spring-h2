package com.mx.macc.service;

import com.mx.macc.model.Task;

import java.util.List;
import java.util.Optional;


public interface ITaskService {

    List<Task> getTask();
    Task addTask(Task task);
    Optional<Task> findByTask(Long id);
    Task updateTask(Task task);
    void deleteTask(Long id);

}
