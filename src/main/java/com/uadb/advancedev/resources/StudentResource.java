package com.uadb.advancedev.resources;

import com.uadb.advancedev.dto.StudentDTO;
import com.uadb.advancedev.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
