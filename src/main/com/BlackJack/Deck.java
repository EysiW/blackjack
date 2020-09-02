package com.BlackJack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        buildDeck();
    }

    public Deck(String filepath) throws IOException, InvalidCardException {
        buildDeck(filepath);
    }

    public void buildDeck(){
        this.deck = new ArrayList<>(52);
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 13; j++) {
                this.deck.add(new Card(i, j));
            }
        }
    }

    public void buildDeck(String filepath) throws IOException, InvalidCardException {
        String line;
        File file = new File(filepath);
        if (file.isFile()) {
            BufferedReader txtReader = new BufferedReader(new FileReader(filepath));
            line = txtReader.readLine();
            line = line.replace(" ", "");
            String[] cards = line.split(",");
            txtReader.close();
            int size = cards.length;
            this.deck = new ArrayList<>(size);
            for (String s : cards) {
                this.deck.add(new Card(s));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(this.deck);
    }

    public void resetAndShuffle() {
        buildDeck();
        shuffleDeck();
    }

    public Card drawCard() throws EmptyDeckException{
        if (isEmpty()) {
            throw new EmptyDeckException();
        }
        return this.deck.remove(0);
    }

    public boolean isEmpty() {
        return this.deck.size() == 0;
    }

    public String toString() {
        int len = this.deck.size();
        String s = "";
        for (Card card : this.deck) {
            s += " " + card.toString();
        }
        return s;
    }

    public static void main(String[] args) throws IOException, InvalidCardException {
        Deck d = new Deck("deck.txt");
        System.out.println(d);

    }
}
