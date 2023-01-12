package com.example.LMSbackend.Models;

import com.example.LMSbackend.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
      @OneToOne
      @JoinColumn()
      private Student student;


      @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
      private List<Book> booksIssued;
}
