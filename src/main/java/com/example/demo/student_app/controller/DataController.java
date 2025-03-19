package com.example.demo.student_app.controller;

import com.example.demo.student_app.model.Course;
import com.example.demo.student_app.model.Grade;
import com.example.demo.student_app.model.School;
import com.example.demo.student_app.model.Student;
import com.example.demo.student_app.service.CourseServiceImpl;
import com.example.demo.student_app.service.GradeServiceImpl;
import com.example.demo.student_app.service.SchoolServiceImpl;
import com.example.demo.student_app.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.Set;

@RestController
public class DataController {

    private final SchoolServiceImpl schoolService;

    private final StudentService studentService;

    private final CourseServiceImpl courseService;

    private final GradeServiceImpl gradeService;

    public DataController(SchoolServiceImpl schoolService, StudentService studentService, CourseServiceImpl courseService, GradeServiceImpl gradeService) {
        this.schoolService = schoolService;
        this.studentService = studentService;
        this.courseService = courseService;
        this.gradeService = gradeService;
    }

    @GetMapping("/addData")
    public String addData(){

        // Create and save a school
        School school = new School();
        school.setName("Example School");
        schoolService.addSchool(school);

// Create and save students
        Student student1 = new Student();
        student1.setName("John Doe");
        student1.setSchool(school);

        Student student2 = new Student();
        student2.setName("Jane Smith");
        student2.setSchool(school);

        studentService.addStudent(student1);
        studentService.addStudent(student2);

        // Create and save courses


        Grade grade1 = new Grade();
        grade1.setGradeValue("1");
        gradeService.addGrade(grade1);
        Grade grade2 = new Grade();
        grade2.setGradeValue("2");
        gradeService.addGrade(grade2);

        Course course1 = new Course();
        Random random = new Random();

        course1.setName("Math 101");
        courseService.addCourse(course1);
        Course course2 = new Course();
        course2.setName("Science 101");
        courseService.addCourse(course2);

        // Enroll grade in courses
        grade1.setCourse(course1);
        grade2.setCourse(course2);
//        course1.setGrade(grade1);
//        course2.setGrade(grade2);
//        courseService.addCourse(course1);
//        courseService.addCourse(course2);
        gradeService.addGrade(grade1);
        gradeService.addGrade(grade2);



        student1.getCourses().add(course1);
        student1.getCourses().add(course2);


//        student1.setCourses(new HashSet<>());
//        student1.setCourses(Set.of(courseDTO, courseDTO1));
        // Enroll students in courses
        Set<Course> courses1 = student1.getCourses();
//        student1.add(course1);
//        courseService.addCourse(course1);
//
        Course course3 = new Course();
        course3.setName("Math 201");
        courseService.addCourse(course3);

        Course course4 = new Course();
        course4.setName("Science 201");
        courseService.addCourse(course4);

//        student2.setCourses(Set.of(course3, course4));
        Set<Course> courses2 = student2.getCourses();
//        courses2.add(course2);


        // Enroll students in courses
//        student1.getCourses().add(course1);
//        student2.getCourses().add(course2);

        student2.getCourses().add(course3);
        student2.getCourses().add(course4);
        studentService.addStudent(student1);
        studentService.addStudent(student2);

        return "Data Added Successfully!";
    }
}
