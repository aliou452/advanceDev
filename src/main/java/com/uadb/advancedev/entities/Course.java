package com.uadb.advancedev.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToOne
    private Professor professor;

    @ManyToMany
    private Set<Student> studentSet;
}
