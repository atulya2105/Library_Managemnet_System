package com.example.LMSbackend.Conrollers;

import com.example.LMSbackend.RequestDto.BookRequestDto;
import com.example.LMSbackend.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/create")
    public ResponseEntity<String> createBooks(@RequestBody()BookRequestDto bookRequestDto){

        String result = bookService.createBook(bookRequestDto);

        return new ResponseEntity<>(result, HttpStatus.CREATED);

    }
}
