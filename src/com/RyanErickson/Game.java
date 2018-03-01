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
            //instantiates the player(s) and dealer
            Player player = new Player(money);
            players.add(player);

        }

        //Instantiates the deck and shuffles (Should this be done in a setter?)
        this.deck = new CardDeck();
        this.deck.shuffle();
    }

    public void deal() {
        //Adds cards to dealers[index0] and players[index1+] hands
        for(int d = 0; d < players.size(); d++) {
            for(int c = 0; c < 2; c++) {
                players.get(d).addCard(deck.getNextCard());
            }
        }
    }

    public void gamePlay() {

        for(int t = 1; t <= players.size(); t++) {
            System.out.println(t);
            boolean stayHit = true;
            while (stayHit) {
                System.out.println("Dealer shows a " + players.get(0).showCard());
                System.out.println("Player " + t + " you have" + players.get(t).getHand());
                System.out.println("Your total is " + players.get(t).getHandTotal());
                stayHit = players.get(t).stayOrHit(stayHit);
                if(stayHit){
                    players.get(t).addCard(deck.getNextCard());
                } else {
                    break;
                }
            }

        }

        }

    public void stayOrHit() {

    }


}
