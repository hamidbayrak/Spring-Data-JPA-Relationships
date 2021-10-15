package com.example.springdatajparelationships.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class StudentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int info_id;
    private int phone;
    private String email;
    private String address;
    private Date birth_date;

    @OneToOne(mappedBy = "studentInfo")
    private Student student;


}
