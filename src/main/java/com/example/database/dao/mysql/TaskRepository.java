package com.example.database.dao.mysql;

import com.example.database.entity.mysql.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
