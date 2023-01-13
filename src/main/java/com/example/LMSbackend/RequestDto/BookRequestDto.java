package com.example.LMSbackend.RequestDto;

import com.example.LMSbackend.Enums.Genre;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class BookRequestDto {


    private String name;
    private Genre genre;
    private int authorId;
}
