package com.BlackJack;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException, InvalidCardException {
		if (args.length > 1) {
			System.out.println("Only accepts one argument");
		}
		else if(args.length == 1){
			try {
				FinnBlackJack game = new FinnBlackJack(args[0]);
				String winner = game.play();
				System.out.println(winner);
				System.out.println(game);
			}
			catch (FileNotFoundException e) {
				System.out.println("File not found");
			}
		}
    	else {
			FinnBlackJack game = new FinnBlackJack();
			String winner = game.play();
			System.out.println(winner);
			System.out.println(game);
		}
	}

}
