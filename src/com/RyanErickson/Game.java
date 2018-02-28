package com.RyanErickson;

import java.util.List;

public class Game {

    private List<Player> players;
    private CardDeck deck;

    public Game(int playerAmount, int money) {
        for(int i = 0; i < playerAmount + 1; i++) {
            //instantiates the players and dealer
            Player player = new Player(money);
            this.players.add(player);
        }


        //Instantiates the deck and shuffles (Should this be done in a setter?)
        this.deck = new CardDeck();
        this.deck.shuffle();
    }

    public void deal() {
        this.deck.getNextCard();
    }

}
