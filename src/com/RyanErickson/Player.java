package com.RyanErickson;

import java.util.ArrayList;
import java.util.List;

public class Player {

    List<Card> hand;
    private int money;

    public Player(int money){
        hand = new ArrayList<Card>();
        this.money = money;
    }

    public int getHandTotal(){
        int total = 0;


        return total;
    }

    public void clearHand() {
        this.hand = new ArrayList<Card>();
    }

    public List<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public void setHand(List<Card> hand, Card card) {
        this.hand = hand;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}


