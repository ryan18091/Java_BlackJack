package com.RyanErickson;

import java.util.ArrayList;
import java.util.Random;

class Card {  // A card

    private Suit suit;
    private Rank rank;
    private int value;

    Card(Suit suit, Rank rank, int value) {   // constructor
        this.suit = suit;
        this.rank = rank;
        this.value = value;

    }

    Rank getRank() {
        return rank; }

    public int getValue(){
        return this.value;
    }

    Suit getSuit() {
        return suit; }
    public String toString() { return rank + " of " + suit + "with a value of " + value; }
}
