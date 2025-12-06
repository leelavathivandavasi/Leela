package com.jspiders;

import jakarta.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stdid;
    @Column(name="sname",nullable = false)
     private String name;
    @Column(name="marks")
    private Double marks;
}
