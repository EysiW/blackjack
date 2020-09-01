package com.BlackJack;

public class InvalidCardException extends Exception{
    public InvalidCardException() {
        System.out.println("Invalid card. Possible suits: {C, D, H, S}, possible ranks: {" +
                "A, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}");
    }
}
