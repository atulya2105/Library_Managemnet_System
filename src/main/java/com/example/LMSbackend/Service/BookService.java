package com.example.LMSbackend.Service;

import com.example.LMSbackend.Converter.BookConvertor;
import com.example.LMSbackend.Models.Author;
import com.example.LMSbackend.Models.Book;
import com.example.LMSbackend.Repository.AuthorRepository;
import com.example.LMSbackend.Repository.BookRepository;
import com.example.LMSbackend.RequestDto.BookRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {
    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;
    public String createBook(BookRequestDto bookRequestDto){



        try {
            Book book = BookConvertor.convertDtoToBookEntity(bookRequestDto);

            // get the author id;
            int authorId = bookRequestDto.getAuthorId();

            // get the author entity from the database
            Author author = authorRepository.findById(authorId).get();

            // set the author in book as well
            book.setAuthor(author);

            // set the list of book as well im the author class
            List<Book> currentList = author.getBookWritten();
            currentList.add(book);
            author.setBookWritten(currentList);

            authorRepository.save(author);

            //here we don't need to save the book again because it's been saved by automatically when
            // we saved author
           // bookRepository.save(book);
        }catch (Exception e){
            log.info("There is been caused in the bookCreate layer");
            return "Book is not created yet";
        }

        return "Successfully book has been saved in the database";
    }
}
