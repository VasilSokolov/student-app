package com.example.demo.student_app.controller;

import com.example.demo.student_app.dto.SchoolDTO;
import com.example.demo.student_app.model.School;
import com.example.demo.student_app.service.SchoolServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/school")
@RequiredArgsConstructor
public class SchoolController {


    private final SchoolServiceImpl schoolService;

    @PostMapping
    public School addSchool(@RequestBody School school) {
        return schoolService.addSchool(school);
    }

}
