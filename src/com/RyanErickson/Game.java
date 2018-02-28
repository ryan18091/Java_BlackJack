package com.RyanErickson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Game {

    List<Player> players;
    private CardDeck deck;

    public Game(int playerAmount, int money) { //Constructor
        players = new ArrayList<Player>();


        for(int i = 0; i < playerAmount + 1; i++) {
            //instantiates the players and dealer
            Player player = new Player(money);
            players.add(player);

            //check to confirm size of arraylist
//            System.out.println(players.size());
        }

        //Instantiates the deck and shuffles (Should this be done in a setter?)
        this.deck = new CardDeck();
        this.deck.shuffle();
    }

    public void deal() {
        System.out.println(players.size());
        for(int d = 0; d <players.size(); d++) {
            System.out.println(deck.getNextCard());
            players.get(0).
        }


        System.out.println(players.get(0).getHand());

    }

}
