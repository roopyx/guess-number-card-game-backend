package com.cardguess.entity.CardNumber;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "card")
public class CardNumber {

    @DynamoDBHashKey
    private String cardId;

    @DynamoDBAttribute
    private List<Integer> numbers;
}
