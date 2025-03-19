package com.example.demo.student_app.service;


import com.example.demo.student_app.model.Course;
import com.example.demo.student_app.model.Grade;
import com.example.demo.student_app.repository.CourseRepo;
import com.example.demo.student_app.repository.GradeRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class GradeServiceImpl {

    private final ObjectMapper objectMapper;
    private final GradeRepo gradeRepo;

//    public GradeServiceImpl(ObjectMapper objectMapper, CourseRepo courseRepo) {
//        this.objectMapper = objectMapper;
//        this.courseRepo = courseRepo;
//    }

//    public List<Course> findAll() {
//        return gradeRepo.findAll();
//    }

    public Grade addGrade(Grade grade){
        Grade courseDB = gradeRepo.save(grade);
//        CourseDTO courseDTO = objectMapper.convertValue(courseDB, CourseDTO.class);

        return courseDB;
    }
}
