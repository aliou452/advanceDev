package com.uadb.advancedev.mappers;


import com.uadb.advancedev.dto.StudentDTO;
import com.uadb.advancedev.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper extends EntityMapper<StudentDTO, Student>{


    @Mapping(source = "courseSet", target = "courseDTOSet")
    StudentDTO toDto(Student student);

    Student toEntity(StudentDTO studentDTO);

    List<StudentDTO> toDto(List<Student> studentList);
}
