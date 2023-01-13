package com.example.LMSbackend.ResponseDto;

import com.example.LMSbackend.Enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor

public class BookResponseDto {
    String name;
    Genre genre;
}
