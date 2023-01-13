package com.example.LMSbackend.Service;

import com.example.LMSbackend.Converter.AuthorConverter;
import com.example.LMSbackend.Models.Author;
import com.example.LMSbackend.Repository.AuthorRepository;
import com.example.LMSbackend.RequestDto.AuthorRequestDto;
import com.example.LMSbackend.ResponseDto.AuthorResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;


    //This is the first and direct  way to convert dto to entity
    /*public String createAuthor(AuthorRequestDto authorRequestDto){

        Author author = new Author();

        author.setName(authorRequestDto.getName());
        author.setAge(authorRequestDto.getAge());
        author.setCountry(authorRequestDto.getCountry());
        author.setEmial(authorRequestDto.getEmial());

        authorRepository.save(author);

        return "Author is saved in the database";
    }

     */

    public String createAuthor(AuthorRequestDto authorRequestDto){

        try{
            Author author = AuthorConverter.convertIntoAuthorEntity(authorRequestDto);
            authorRepository.save(author);
        }catch (Exception e){
            log.info("AuthorCreate has caused of error");
            return "Author is not created yet";
        }

        return "Successfully author is has been saved in the database";
    }

    public List<AuthorResponseDto> findAuthorByName(String name){

        List<Author> authors = authorRepository.findByName(name);

        List<AuthorResponseDto> authorResponseDtos = AuthorConverter.convertAuthorDtoToEntity(authors);

        return authorResponseDtos;

    }

}
