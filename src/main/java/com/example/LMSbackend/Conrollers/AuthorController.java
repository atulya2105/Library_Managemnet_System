package com.example.LMSbackend.Conrollers;

import com.example.LMSbackend.RequestDto.AuthorRequestDto;
import com.example.LMSbackend.ResponseDto.AuthorResponseDto;
import com.example.LMSbackend.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;
    @PostMapping("/create")
    public ResponseEntity<String> createAuthor(@RequestBody()AuthorRequestDto authorRequestDto){
        String result = authorService.createAuthor(authorRequestDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    @GetMapping("/findBy/{name}")
    public List<AuthorResponseDto> findByName(@PathVariable("name")String name){

        return authorService.findAuthorByName(name);
    }
}
