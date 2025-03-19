package com.example.demo.student_app.service;


import com.example.demo.student_app.dto.CourseDTO;
import com.example.demo.student_app.model.Course;
import com.example.demo.student_app.model.School;
import com.example.demo.student_app.repository.CourseRepo;
import com.example.demo.student_app.repository.SchoolRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CourseServiceImpl {

    private final ObjectMapper objectMapper;
    private final CourseRepo courseRepo;

    public CourseServiceImpl(ObjectMapper objectMapper, CourseRepo courseRepo) {
        this.objectMapper = objectMapper;
        this.courseRepo = courseRepo;
    }

    public List<Course> findAll() {
        return courseRepo.findAll();
    }

    public Course addCourse(Course course){
        Course courseDB = courseRepo.save(course);
//        CourseDTO courseDTO = objectMapper.convertValue(courseDB, CourseDTO.class);

        return courseDB;
    }
}
