package com.uadb.advancedev.mappers;

import com.uadb.advancedev.dto.CourseDTO;
import com.uadb.advancedev.entities.Course;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CourseMapper extends EntityMapper<CourseDTO, Course> {


    CourseDTO toDto(Course course);

    Course toEntity(CourseDTO courseDTO);

    List<Course> toEntity(List<CourseDTO> courseDTOList);

    List<CourseDTO> toDto(List<Course> courseList);
}
