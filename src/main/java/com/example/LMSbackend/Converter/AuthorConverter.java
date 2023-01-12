package com.example.LMSbackend.Converter;

import com.example.LMSbackend.Models.Author;
import com.example.LMSbackend.RequestDto.AuthorRequestDto;

public class AuthorConverter {

    public static Author convertIntoAuthorEntity(AuthorRequestDto authorRequestDto){
        Author author = Author.builder().name(authorRequestDto.getName()).age(authorRequestDto.getAge()).
                country(authorRequestDto.getCountry()).
                emial(authorRequestDto.getEmial()).
                build();
        return author;
    }
}
