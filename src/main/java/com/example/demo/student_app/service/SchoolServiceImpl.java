package com.example.demo.student_app.service;


import com.example.demo.student_app.dto.SchoolDTO;
import com.example.demo.student_app.model.School;
import com.example.demo.student_app.model.Student;
import com.example.demo.student_app.repository.SchoolRepo;
import com.example.demo.student_app.repository.StudentRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SchoolServiceImpl {

    private final ObjectMapper objectMapper;
    private final SchoolRepo schoolRepo;

    public List<School> findAll() {
        return schoolRepo.findAll();
    }

    public School addSchool(School school){
        School schoolDB = schoolRepo.save(school);
//        SchoolDTO schoolDTO = objectMapper.convertValue(schoolDB, SchoolDTO.class);

        return schoolDB;
    }

}
