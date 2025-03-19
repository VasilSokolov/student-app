package com.example.demo.student_app.repository;

import com.example.demo.student_app.model.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepo extends JpaRepository<Reminder, Long> {


}
