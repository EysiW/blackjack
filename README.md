# blackjack

mainmethod: src/main/com/blackjack/main

The main method accepts one file as commandline input.
Requirement for file:
  - one line commaseparated file
  - File contains a list of cards (Suit+Rank)
  - accepted suits = {C, D, H, S}
  - accepted ranks = {A, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K}

If a file is given, the deck will not be shuffled before start of game

If no argument is given, the game will be played with a standard deck of 52 cards. The deck is automatically shuffled before start of game.
