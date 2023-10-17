package com.uadb.advancedev.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "professor")
    private Set<Course> courseSet;
}
