package com.cardguess.entity.CardNumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:3000")
public class CardNumberController {

    @Autowired
    private CardNumberService cardNumberService;

    @GetMapping("/card/all")
    public List<CardNumber> getAllCardNumber() {
        return cardNumberService.getAllCards();
    }

    @GetMapping("/card/getNumberWin")
    public int getNumberWin(@RequestParam int[] numbers) {
        return cardNumberService.calculateNumberWin(numbers);
    }


}
