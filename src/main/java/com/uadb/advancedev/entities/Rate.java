package com.uadb.advancedev.entities;

import com.uadb.advancedev.entities.enums.RateValue;
import jakarta.persistence.*;

@Entity
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private RateValue rating;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Professor professor;
}
