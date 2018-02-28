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
        //Adds cards to dealers[index0] and players[index1+] hands
        System.out.println(players.size());
        for(int d = 0; d <players.size(); d++) {
            for(int c = 0; c < 2; c++) {
//              System.out.println(deck.getNextCard());
                players.get(c).addCard(deck.getNextCard());
            }
        }
//        System.out.println(players.get(0).getHand());
    }

    public void gamePlay() {
        boolean turn = true;

        while (turn) {
            for(int t = 1; t <= players.size(); t++) {
                System.out.println("Dealer shows a " + players.get(0).getHand());
                System.out.println("You have" + players.get(t).getHand());
                System.out.println("Your total is " + players.get(t).getHandTotal());
                break;
            }
            turn = false;

        }


    }

}
