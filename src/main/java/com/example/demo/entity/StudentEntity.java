package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GenaratedValue
@Entity
public class StudentEntity{
    @Id;
    @GenaratedValue(strategy = GenerationType.IDENTITY)

     private Long id;
     private String name;
     private String email;
     private float cgpa;
}