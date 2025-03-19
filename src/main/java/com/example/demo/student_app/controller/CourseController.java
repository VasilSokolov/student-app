package com.example.demo.student_app.controller;


import com.example.demo.student_app.model.Course;
import com.example.demo.student_app.service.CourseServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    private final CourseServiceImpl courseServiceImpl;

    public CourseController(CourseServiceImpl courseServiceImpl) {
        this.courseServiceImpl = courseServiceImpl;
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course) {
        return courseServiceImpl.addCourse(course);
    }
}
