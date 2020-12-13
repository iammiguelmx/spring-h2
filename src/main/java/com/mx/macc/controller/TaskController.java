package com.mx.macc.controller;

import com.mx.macc.model.Task;
import com.mx.macc.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//API = http://localhost:8080/api/v1/listAll
@RestController
@RequestMapping(value = "api/v1")
public class TaskController {

    @Autowired
    private ITaskService iTaskService;

    @GetMapping(value = "listAll")
    public List<Task> getAllTask(){
        return iTaskService.getTask();
    }

    @PostMapping(value = ("addTask"))
    public Task add(Task task){
        return iTaskService.addTask(task);
    }

 }
