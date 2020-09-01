package com.BlackJack;

public class EmptyDeckException extends Exception{
    public EmptyDeckException() {
        System.out.println("The customized deck is invald. Deck ran out of cards before game could finish");
    }
}
