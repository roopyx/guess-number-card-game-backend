package com.cardguess.controller;

import com.cardguess.entity.CardNumber;
import com.cardguess.repository.CardNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:3000")
public class CardNumberController {

    @Autowired
    private CardNumberRepository cardNumberRepository;

    @GetMapping("/card/{id}")
    public CardNumber getCardNumber(@PathVariable("id") String cardId) {
        return cardNumberRepository.getCardNumberById(cardId);
    }

    @GetMapping("/card/all")
    public List<CardNumber> getAllCardNumber() {
        return cardNumberRepository.getAllCardNumber();
    }

}
