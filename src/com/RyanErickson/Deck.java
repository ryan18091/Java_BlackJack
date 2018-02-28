package com.RyanErickson;


import java.util.*;

enum Suit { SPADE, DIAMOND, CLUB, HEART }
enum Rank { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING }


class CardDeck {  // A deck of card

    List<Card> deck;


    public CardDeck() {   // constructor
        deck = new ArrayList<Card>();

        for (Suit suit : Suit.values()) {
            int i = 1;
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank, i++));
            }
        }
    }



    public Card getNextCard() {
        Card nextCard = deck.get(0);
        nextCard = deck.remove(0);
        System.out.println(nextCard);
        return nextCard;
    }


    public void print() {
        for (Card card : deck) System.out.println(card);   // print all cards
    }


    public void shuffle() {
        Collections.shuffle(deck);  // use java.util.Collections' static method to shuffle the List
    }
}







