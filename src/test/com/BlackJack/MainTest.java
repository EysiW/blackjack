package com.BlackJack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void runAllTest() throws Exception {
        CardTest cardTest = new CardTest();
        cardTest.isCard();

        HandTest handTest = new HandTest();
        handTest.isBlackJack();
        handTest.isStartBlackJack();
        handTest.scores();
    }
}