package com.example.LMSbackend.RequestDto;

import com.example.LMSbackend.Enums.Genre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookRequestDto {


    private String name;
    private Genre genre;
    private int authorId;
}
