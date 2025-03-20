package com.example.demo.student_app.repository;

import com.example.demo.student_app.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

//    @Query("select s from Student s where s.school is not null")
//@Query("SELECT s FROM Student s WHERE s.school IS NOT NULL")
//    List<Student> findBySchoolIsNotNull();

    List<Student> findBySchoolIsNotNull();

    List<Student> findAllByAge(Integer age);

    Optional<Student> findByAge(Integer age);
}
