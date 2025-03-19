package com.example.demo.student_app.service;

import com.example.demo.student_app.model.User;
import com.example.demo.student_app.projection.UserProjection;
import com.example.demo.student_app.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserProjection> getUsers() {
        return userRepository.findBy();
    }

    // CREATE
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    // READ (Get all users)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // READ (Get user by ID)
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // READ (Get user by email)
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // UPDATE
    public User updateUser(Long id, User updatedUser) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setFirstName(updatedUser.getFirstName());
                    user.setLastName(updatedUser.getLastName());
                    user.setEmail(updatedUser.getEmail());
                    user.setPhoneNumber(updatedUser.getPhoneNumber());
                    return userRepository.save(user);
                })
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }

    // DELETE
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // GET USERS USING PROJECTION
    public List<UserProjection> getUserProjections() {
        return userRepository.findBy();
    }
}
