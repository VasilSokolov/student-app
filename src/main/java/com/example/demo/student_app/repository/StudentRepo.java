package com.example.demo.student_app.repository;

import com.example.demo.student_app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

//    @Query("select s from Student s where s.school is not null")
    List<Student> findAllBySchoolIsNotNull();

    List<Student> findAllByAge(Integer age);

    Student findByAge(Integer age);
}
