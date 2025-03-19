package com.example.demo.student_app.repository;

import com.example.demo.student_app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

//    @Query("select s from Student s where s.school is not null")
@Query("SELECT s FROM Student s WHERE s.school IS NOT NULL")
    List<Student> findBySchoolIsNotNull();

//    List<Student> findBySchoolIsNotNull();
    List<Student> findAllByAge(Integer age);

    Student findByAge(Integer age);
}
