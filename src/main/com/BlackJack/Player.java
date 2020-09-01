package com.BlackJack;

public class Player {
    private String name;
    private Hand hand;
    int limit = 17;

    public Player() {
        hand = new Hand();
    }

    public void setName(String name1) {
        name = name1;
    }

    public String getName() {
        return name;
    }

    public int handScore() {
        return hand.calculateScore();
    }

    public boolean haveBlackJack() {
        return hand.isBlackJack();
    }

    public void addCard(Card card) {
        hand.addCard(card);
    }

    public String toString() {
        return name + ":" + hand.toString();
    }
}
