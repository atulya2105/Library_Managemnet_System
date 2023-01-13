package com.example.LMSbackend.ResponseDto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AuthorResponseDto {
    private int id;

    private String name;

    private int age;

    private String country;

    private String email;

    //List<BookResponseDto> bookWritten;

}
