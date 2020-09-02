package com.BlackJack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Card {
    private int suit;
    private int rank;
    private Pattern pattern = Pattern.compile("[CDHS]([1-9]|10|[AJQK])$");

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Create a card with a string
    public Card(String s) throws InvalidCardException{
        int len = s.length();
        Matcher matcher = pattern.matcher(s);
        boolean matchFound = matcher.find();
        // Check if it is a valid card, string = suit+rank
        if (!matchFound) {
            throw new InvalidCardException();
        }
        char[] ranks = {'A', '2', '3', '4', '5', '6',
                '7', '8', '9', '0', 'J', 'Q', 'K'};
        char[] suits = {'C', 'D', 'H', 'S'};
        char suit = s.charAt(0);
        char rank = s.charAt(1);
        for (int i = 0; i <= 3; i++) {
            if (suit == suits[i]) {
                this.suit = i;
            }
        }

        if (len == 3) {
            this.rank = 10;
        }
        else {
            for (int i = 1; i <= 13; i++) {
                if (s.charAt(1) == ranks[i-1]) {
                    this.rank = i;
                }
            }
        }
    }

    public int getSuit() {
        return this.suit;
    }

    public int getRank() {
        return this.rank;
    }

    public String toString() {
        String[] ranks = {null, "A", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"C", "D", "H", "S"};
        return suits[this.suit] + ranks[this.rank];
    }
}
