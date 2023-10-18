package com.uadb.advancedev.services.impl;

import com.uadb.advancedev.dto.CourseDTO;
import com.uadb.advancedev.entities.Course;
import com.uadb.advancedev.mappers.CourseMapper;
import com.uadb.advancedev.repositories.CourseRepository;
import com.uadb.advancedev.services.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    public CourseServiceImpl(CourseRepository courseRepository, CourseMapper courseMapper) {
        this.courseRepository = courseRepository;
        this.courseMapper = courseMapper;
    }

    @Override
    public void save(CourseDTO courseDTO) {

        courseRepository.save(courseMapper.toEntity(courseDTO));
    }

    @Override
    public CourseDTO getCourseById(long courseId) {

        Course course = courseRepository.findById(courseId).orElseThrow();
        return courseMapper.toDto(course);
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        return courseMapper.toDto(courseRepository.findAll());
    }
}
