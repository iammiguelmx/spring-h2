package com.mx.macc.dao;

import com.mx.macc.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaskDAO  extends CrudRepository<Task, Long> {
}
