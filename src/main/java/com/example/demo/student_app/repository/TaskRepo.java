package com.example.demo.student_app.repository;

import com.example.demo.student_app.model.Course;
import com.example.demo.student_app.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {


}
