package com.example.LMSbackend.Service;

import com.example.LMSbackend.Enums.CardStatus;
import com.example.LMSbackend.Models.Card;
import com.example.LMSbackend.Models.Student;
import com.example.LMSbackend.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;
    public Card createCard(Student student){
        Card newCard = new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student);


        return newCard;
    }

}
