package com.mx.macc.service;

import com.mx.macc.model.Task;

import java.util.List;
import java.util.Optional;


public interface ITaskService {

    //Obtener todas las tareas
    List<Task> getTask();
    //Agregar una tarea
    Task addTask(Task task);
    //Encontrar por ID una tarea
    Optional<Task> findByTask(Long id);
    //Actualizar Tarea
    Task updateTask(Task task);
    //Eliminar tarea por ID
    void deleteTask(Long id);

}
