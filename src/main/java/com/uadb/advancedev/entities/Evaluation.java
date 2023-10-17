package com.uadb.advancedev.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int value;

    @ManyToOne
    private Professor professor;

    @ManyToOne
    private Course course;

}
