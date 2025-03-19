package com.example.demo.student_app.service;


import com.example.demo.student_app.dto.StudentDTO;
import com.example.demo.student_app.model.Student;
import com.example.demo.student_app.repository.StudentRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student addStudent(Student student){
        return studentRepo.save(student);
    }

    public List<StudentDTO> findAllBySchoolNotNull(){


        List<Student> students = studentRepo.findAllBySchoolIsNotNull();
        return students.stream()
                .map(student -> new StudentDTO(student.getId(), student.getName(), student.getSchool().getId()))
                .collect(Collectors.toList());
//        return studentRepo.findAllBySchoolIsNotNull();
    }

    @Override
    @Transactional
    public List<StudentDTO> findAllByAge(Integer age) {
        Student byAgeIsNotNull = studentRepo.findByAge(age);
        List<Student> students = studentRepo.findAllByAge(byAgeIsNotNull.getAge());
        return students.stream()
                .map(student -> new StudentDTO(student.getId(), student.getName(), student.getSchool().getId()))
                .collect(Collectors.toList());
    }
}
