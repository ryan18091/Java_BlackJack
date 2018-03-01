package com.RyanErickson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealer {

    private Card cards;

    Scanner sc = new Scanner(System.in);

    private List<Card> hand;
    private int money;

    public Dealer(int money){
        hand = new ArrayList<Card>();
        this.money = money;
    }

    public boolean dealersPlay(boolean dealersTurn){
        System.out.println("The dealer shows " + this.getHand() + "for a total of " + this.getHandTotal());
        if(this.getHandTotal() <= 16) {
            dealersTurn = true;
        } else {dealersTurn = false;}

        return dealersTurn;

    }



    public int getHandTotal(){
        int total = 0;
        for(int i = 0; i < hand.size(); i++){
            total += hand.get(i).getValue();
        }
        return total;
    }

    public Object showCard() {
        return hand.get(1);
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

