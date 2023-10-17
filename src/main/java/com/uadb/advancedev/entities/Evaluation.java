package com.uadb.advancedev.entities;

import jakarta.persistence.*;

@Entity
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int rating;

    @ManyToOne
    private Professor professor;

    @ManyToOne
    private Course course;

}
