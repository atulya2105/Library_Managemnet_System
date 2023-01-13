package com.example.LMSbackend.Converter;

import com.example.LMSbackend.Models.Author;
import com.example.LMSbackend.RequestDto.AuthorRequestDto;
import com.example.LMSbackend.ResponseDto.AuthorResponseDto;

import java.util.ArrayList;
import java.util.List;

public class AuthorConverter {

    public static Author convertIntoAuthorEntity(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().name(authorRequestDto.getName()).age(authorRequestDto.getAge()).
                country(authorRequestDto.getCountry()).
                emial(authorRequestDto.getEmial()).
                build();
        return author;
    }

    public static List<AuthorResponseDto> convertAuthorDtoToEntity(List<Author> authors){
        List<AuthorResponseDto> authorResponseDtos = new ArrayList<>();
        for(Author author:authors){
            AuthorResponseDto authorResponseDto = AuthorResponseDto.builder().name(author.getName())
                    .email(author.getEmial())
                    .age(author.getAge())
                    .email(author.getEmial())
                    .country((author.getCountry())).build();
            authorResponseDtos.add(authorResponseDto);

        }
        return authorResponseDtos;
    }
}
