package com.uadb.advancedev.resources;

import com.uadb.advancedev.dto.StudentDTO;
import com.uadb.advancedev.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentResource {

    private final StudentService studentService;

    public StudentResource(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping("/students")
    public String save(@RequestBody StudentDTO studentDTO) {

        studentService.save(studentDTO);

        return "Etudiant bien créé";
    }

    @GetMapping("/students")
    public List<StudentDTO> getStudents() {

        return studentService.getAllStudents();
    }

    @GetMapping("/students/{studentId}")
    public Optional<StudentDTO> getStudentById(@PathVariable long studentId) {

        return studentService.getStudentById(studentId);
    }
}
