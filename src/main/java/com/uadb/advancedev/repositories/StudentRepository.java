package com.uadb.advancedev.repositories;

import com.uadb.advancedev.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    @Query(value = "SELECT DISTINCT st FROM Student st JOIN FETCH st.courseSet")
    List<Student> findAllWithCourse();

}
