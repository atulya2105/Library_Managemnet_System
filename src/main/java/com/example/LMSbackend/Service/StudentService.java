package com.example.LMSbackend.Service;

import com.example.LMSbackend.Enums.CardStatus;
import com.example.LMSbackend.Models.Card;
import com.example.LMSbackend.Models.Student;
import com.example.LMSbackend.Repository.StudentRepository;
import com.example.LMSbackend.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CardService cardService;
    public String createStudent(StudentRequestDto studentRequestDto){
        // to convert dto to entity

        Student  student = new Student();
        student.setAge(studentRequestDto.getAge());
        student.setName(studentRequestDto.getName());
        student.setEmail(studentRequestDto.getEmail());
        student.setCountry(studentRequestDto.getCountry());

        // Card object also should be taken care by student update.
        Card newCard = cardService.createCard(student);
        student.setCard(newCard);
        studentRepository.save(student);
        return "Successfully student is saved in the database";
    }
}
