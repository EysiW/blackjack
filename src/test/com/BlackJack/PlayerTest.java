package com.BlackJack;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.Assert;

public class PlayerTest {

    @Test
    public void haveBlackJack() throws Exception{
        int aceRank = 1;
        int[] tenRank = {10, 11, 12, 13};
        for (int rank : tenRank) {
            Card card1 = new Card(0, aceRank);
            Card card2 = new Card(0, rank);
            Hand hand = new Hand();
            hand.addCard(card1);
            hand.addCard(card2);
            assertTrue(hand.isBlackJack(), "11 + 10 must be 21");
        }
    }
}