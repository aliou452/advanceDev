package com.uadb.advancedev.services.impl;

import com.uadb.advancedev.dto.StudentDTO;
import com.uadb.advancedev.entities.Student;
import com.uadb.advancedev.repositories.StudentRepository;
import com.uadb.advancedev.services.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
class StudentServiceImplTest {


    @Autowired
    private StudentService studentService;

    @MockBean
    private StudentRepository studentRepositoryMock;

    @BeforeEach
    void setUp() {
    }

    @Test
    void save() {

        StudentDTO studentDTO = getStudentDTO("Serigne");
        when(studentRepositoryMock.save(any(Student.class))).thenReturn(null);

        studentService.save(studentDTO);

        verify(studentRepositoryMock).save(any(Student.class));

    }

    @Test
    void getAllStudents() {

    }

    @Test
    void getStudentById() {
    }

    private StudentDTO getStudentDTO(String name) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setName(name);
        return studentDTO;
    }
}