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
}