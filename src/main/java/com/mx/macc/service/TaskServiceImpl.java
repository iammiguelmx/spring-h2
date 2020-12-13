package com.mx.macc.service;

import com.mx.macc.dao.ITaskDAO;
import com.mx.macc.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements ITaskService {

    @Autowired
    private ITaskDAO iTaskDAO;

    @Override
    public List<Task> getTask() {
        return (List<Task>) iTaskDAO.findAll();
    }

    @Override
    public Task addTask(Task task) {
        return iTaskDAO.save(task);
    }

    @Override
    public Optional<Task> findByTask(Long id) {
        return iTaskDAO.findById(id);
    }

    @Override
    public Task updateTask(Task task) {
        return iTaskDAO.save(task);
    }

    @Override
    public void deleteTask(Long id) {
         iTaskDAO.deleteById(id);
    }
}
