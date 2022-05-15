package com.cardguess.entity.CardNumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CardNumberService {

    @Autowired
    private CardNumberRepository cardNumberRepository;

    public List<CardNumber> getAllCards() {
        return cardNumberRepository.getAllCardNumber();
    }

    public int calculateNumberWin(int[] numbers) {
        int sum = Arrays.stream(numbers).sum();
        return sum;
    }
}
