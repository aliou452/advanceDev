package com.uadb.advancedev.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class StudentDTO {

    private long id;
    private String name;
    private Set<CourseDTO> courseDTOSet;
}
