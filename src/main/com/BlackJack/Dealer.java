package com.BlackJack;

public class Dealer {
    private String name;
    private Hand hand;

    public Dealer() {
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

    public void addCard(Card card) {
        hand.addCard(card);
    }

    public String toString() {
        return name + ":" + hand.toString();
    }
}
