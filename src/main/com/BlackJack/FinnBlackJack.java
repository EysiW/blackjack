package com.BlackJack;

import java.io.IOException;
import java.util.ArrayList;

public class FinnBlackJack {
    public Deck deck;
    private Player player;
    private Dealer dealer;
    private int playerLimit = 17;

    public FinnBlackJack() {
        deck = new Deck();
        player = new Player();
        player.setName("Sam");
        dealer = new Dealer();
        dealer.setName("Dealer");
    }

    public FinnBlackJack(String deckfile) throws IOException, InvalidCardException {
        deck = new Deck(deckfile);
        player = new Player();
        player.setName("Sam");
        dealer = new Dealer();
        dealer.setName("Dealer");
    }

    public void dealCards() throws EmptyDeckException {
        deck.shuffleDeck();
        player.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
        player.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
    }

    public String toString() {
        String playerHand = player.toString();
        String dealerHand = dealer.toString();
        return playerHand + "\n" + dealerHand;
    }

    public String play() throws EmptyDeckException {
        /**
         * Play a simple game of FinnBlackJack
         * The player draws first until he has minimum 17
         * If the player do not bust, the dealer draws until he wins
         */
        dealCards();
        // Check if player has blackjack
        if (player.haveBlackJack()) {
            return player.getName();
        }
        // Player draw until 17
        while(player.handScore() < playerLimit) {
            player.addCard(deck.drawCard());
        }
        // Player loose if score is higher than 21, wins if he scores a blackjack
        if (player.handScore() > 21) {
            return dealer.getName();
        }
        else if (player.haveBlackJack()) {
            return player.getName();
        }
        int dealerLimit = player.handScore();
        while (dealer.handScore() <= dealerLimit) {
            dealer.addCard(deck.drawCard());
        }
        if (dealer.handScore() <= 21) {
            return dealer.getName();
        }
        else {
            return player.getName();
        }

    }
}
