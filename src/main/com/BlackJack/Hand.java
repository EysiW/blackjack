package com.BlackJack;

public class Hand {
    private Card[] theHand = new Card[17];
    private int numberOfCards = 0;

    public void addCard(Card card) {
        theHand[numberOfCards++] = card;
    }

    public int calculateScore() {
        int score = 0;
        for (int i = 0; i < numberOfCards; i++) {
            int rank = theHand[i].getRank();
            if (rank == 1) {
                score += 11;
            }
            else if (rank > 9) {
                score += 10;
            }
            else {
                score += rank;
            }
        }
        return score;
    }

    public boolean isBlackJack() {
        int score = calculateScore();
        return score == 21;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < numberOfCards-1; i++) {
            String card = theHand[i].toString();
            s += " " + card + ",";
        }
        s += " " + theHand[numberOfCards-1].toString();
        return s;
    }
}
