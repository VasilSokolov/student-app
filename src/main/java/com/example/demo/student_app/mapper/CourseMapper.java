package com.example.demo.student_app.mapper;

import com.example.demo.student_app.dto.CourseDTO;
import com.example.demo.student_app.model.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring") // because we use spring project
public interface CourseMapper {

//    @Mapping(source = "emailId", target = "email") // for different mapping fields from CourseDTO tp Course
//    @Mapping(source = "contactNo", target = "contact")
    Course toEntity(CourseDTO courseDTO);

    CourseDTO toDTO(Course course);

    List<CourseDTO> toDTOList(List<Course> course);
}
