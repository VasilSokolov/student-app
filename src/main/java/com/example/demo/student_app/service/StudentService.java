package com.example.demo.student_app.service;

import com.example.demo.student_app.dto.StudentDTO;
import com.example.demo.student_app.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {

    List<Student> findAll();

    Student addStudent(Student student1);

    List<StudentDTO> findAllBySchoolNotNull();

    List<StudentDTO> findAllByAge(Integer age);
}
