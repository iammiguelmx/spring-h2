package com.mx.macc.controller;

import com.mx.macc.model.Task;
import com.mx.macc.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//API = http://localhost:8080/api/v1/listAll
@RestController
@RequestMapping(value = "api/v1")
public class TaskController {

    @Autowired
    private ITaskService iTaskService;

    @GetMapping("listAll")
    public List<Task> getAllTask(){
        return iTaskService.getTask();
    }

    @PostMapping("addTask")
    public ResponseEntity<?> add(@Validated @RequestBody Task task){
        Map<String, Object> params = new HashMap<>();
        try {
            iTaskService.addTask(task);
        } catch (DataAccessException e) {
            params.put("message", "Se produjo un error al insertar en la base de datos.");
            params.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<>(params, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

 }
