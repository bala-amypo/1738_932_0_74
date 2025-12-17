package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GenaratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity{
    @Id;
    @GenaratedValue(strategy = GenerationType.IDENTITY)

     private Long id;
     private String name;
     private String email;
     private float cgpa;

    public void setName(String name){
        this.name=name;
    }

    public String GetName(){
        return this.name;
    }

    public void setEmail(String email){
        this.name=name;
    }

    public String GetName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String GetName(){
        return this.name;
    }
}