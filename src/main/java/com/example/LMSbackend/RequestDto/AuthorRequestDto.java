package com.example.LMSbackend.RequestDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AuthorRequestDto {

    @Column(nullable = false)
    private String name;
    private int age;
    private String country;
    @Column(nullable = false,unique = true)
    private String emial;

}
