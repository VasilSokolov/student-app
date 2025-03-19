package com.example.demo.student_app.controller;

import com.example.demo.student_app.dto.StudentDTO;
import com.example.demo.student_app.model.Student;
import com.example.demo.student_app.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

//    public StudentController(StudentService studentService){
//        this.studentService = studentService;
//    }

    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.findAll();
    }

    @GetMapping("/existing-school")
    public List<StudentDTO> getAllStudentBySchoolIsNotNull() {
        return studentService.findAllBySchoolNotNull();
    }

    @GetMapping("/{age}")
    public List<StudentDTO> getAllStudentByAge(@PathVariable("age") Integer age) {
        return studentService.findAllByAge(age);
    }
}
