package com.example.demo.student_app.repository;

import com.example.demo.student_app.model.User;
import com.example.demo.student_app.projection.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<UserProjection> findBy();

    @Query("SELECT u.firstName, u.email FROM User u")
//    @Query("SELECT u.firstName AS firstName, u.email AS email FROM User u")
    List<UserProjection> getUsersProjection();

    // Find user by email
    User findByEmail(String email);
}
