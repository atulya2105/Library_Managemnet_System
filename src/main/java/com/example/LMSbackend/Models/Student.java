package com.example.LMSbackend.Models;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(nullable = false)
    private String name;
    private int age;
    @Column(name="school_name",unique = true,nullable = false)
    private String email;


    @CreationTimestamp
    private Date createdOn;
    @UpdateTimestamp
    private Date updatedOn;
    private String country;

    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Card card;
    public Student(String name, int age, String email, String country) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.country = country;
    }
}
