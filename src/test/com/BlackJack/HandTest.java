package com.BlackJack;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {
    @Test
    public void isStartBlackJack() throws Exception{
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
    @Test
    public void isBlackJack() throws Exception {
        int suit = 1;
        int[] combo1 = {2,3,5,5,6};
        int[] combo2 = {1,3,7};
        int[] combo3 = {1,2,4,4};
        int[] combo4 = {2,3,5,1};
        Hand hand1 = new Hand();
        for (int rank : combo1) {
            hand1.addCard(new Card(suit,rank));
        }
        assertTrue(hand1.isBlackJack());
        Hand hand2 = new Hand();
        for (int rank : combo2) {
            hand2.addCard(new Card(suit,rank));
        }
        assertTrue(hand2.isBlackJack());
        Hand hand3 = new Hand();
        for (int rank : combo3) {
            hand3.addCard(new Card(suit,rank));
        }
        assertTrue(hand3.isBlackJack());
        Hand hand4 = new Hand();
        for (int rank : combo4) {
            hand4.addCard(new Card(suit,rank));
        }
        assertTrue(hand4.isBlackJack());
    }

    @Test
    public void scores() {
        Hand hand1 = new Hand();
        hand1.addCard(new Card(1, 1));
        hand1.addCard(new Card(1, 6));
        assertEquals(17, hand1.calculateScore());

        Hand hand2 = new Hand();
        hand2.addCard(new Card(2, 6));
        hand2.addCard(new Card(2, 1));
        assertEquals(17, hand2.calculateScore());

        Hand hand3 = new Hand();
        hand3.addCard(new Card(3, 11));
        hand3.addCard(new Card(3, 6));
        hand3.addCard(new Card(3, 2));
        assertEquals(18, hand3.calculateScore());

        Hand hand4 = new Hand();
        hand4.addCard(new Card(0, 12));
        hand4.addCard(new Card(2, 13));
        assertEquals(20, hand4.calculateScore());

        Hand hand5 = new Hand();
        hand5.addCard(new Card(3, 13));
        hand5.addCard(new Card(0, 13));
        assertEquals(20, hand5.calculateScore());
    }
}