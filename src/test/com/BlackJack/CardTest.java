package com.BlackJack;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    @Test
    public void isCard() throws InvalidCardException {
        String[] suits = {"C", "D", "H", "S"};
        String[] ranks  = {"A", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "J", "Q", "K"};
        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(suit+rank);
            }
        }
    }
}