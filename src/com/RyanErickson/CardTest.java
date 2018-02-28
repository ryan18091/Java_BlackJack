package com.RyanErickson;

public class CardTest {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        deck.print();
        deck.shuffle();
        deck.print();
    }
}