package com.cardguess.entity.CardNumber;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardNumberRepository {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public CardNumber getCardNumberById(String cardId) {
        return dynamoDBMapper.load(CardNumber.class, cardId);
    }

    public List<CardNumber> getAllCardNumber() {
        return dynamoDBMapper.scan(CardNumber.class, new DynamoDBScanExpression());
    }
}
