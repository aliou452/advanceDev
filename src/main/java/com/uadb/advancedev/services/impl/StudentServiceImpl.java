package com.uadb.advancedev.services.impl;

import com.uadb.advancedev.dto.StudentDTO;
import com.uadb.advancedev.entities.Course;
import com.uadb.advancedev.entities.Student;
import com.uadb.advancedev.mappers.StudentMapper;
import com.uadb.advancedev.repositories.CourseRepository;
import com.uadb.advancedev.repositories.StudentRepository;
import com.uadb.advancedev.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;
    private final CourseRepository courseRepository;

    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
        this.courseRepository = courseRepository;
    }

    @Override
    public void save(StudentDTO studentDTO) {

        Student student = studentMapper.toEntity(studentDTO);

        studentRepository.save(student);
    }

    @Override
    public List<StudentDTO> getAllStudents() {

        List<Student> studentList = studentRepository.findAll();
        return studentMapper.toDto(studentList);
    }

    @Override
    public Optional<StudentDTO> getStudentById(long idStudent) {
        Optional<Student> studentOpt = studentRepository.findById(idStudent);

        if(studentOpt.isPresent()) {
            Student student = studentOpt.get();
            StudentDTO studentDTO = new StudentDTO();

            studentDTO.setId(student.getId());
            studentDTO.setName(student.getName());

            return Optional.of(studentDTO);
        }

        return Optional.empty();
    }

    @Override
    public void joinClass(long studentId, long courseId) {

        Student student = studentRepository.findById(studentId).orElseThrow();
        Course course = courseRepository.findById(courseId).orElseThrow();

        Set<Student> studentSet = course.getStudentSet();
        studentSet.add(student);
        course.setStudentSet(studentSet);
    }
}
