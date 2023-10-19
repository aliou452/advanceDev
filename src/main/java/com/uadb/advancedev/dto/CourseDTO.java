package com.uadb.advancedev.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    private long id;
    private String name;
    private Set<StudentDTO> studentDTOs;
}
