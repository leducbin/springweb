package com.example.database.dao.postgresql;

import com.example.database.entity.postgresql.Course;
import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Course, Long> {
}