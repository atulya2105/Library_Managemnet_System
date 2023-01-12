package com.example.LMSbackend.RequestDto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDto {

    @Column(nullable = false)
    private String name;

    private int age;
    @Column(name = "School_name",unique = true,nullable = false)
    private String email;
    private String country;


}
