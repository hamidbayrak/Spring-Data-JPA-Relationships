package com.example.springdatajparelationships.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_id;
    private String course_name;

    @ManyToMany(mappedBy = "courses")
    private Collection<Student> students;


}
