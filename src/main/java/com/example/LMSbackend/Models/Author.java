package com.example.LMSbackend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;
    private int age;
    private String country;
    @Column(nullable = false,unique = true)
    private String emial;


    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Book> bookWritten;
}
