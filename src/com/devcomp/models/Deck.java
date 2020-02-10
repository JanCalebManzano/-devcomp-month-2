package com.devcomp.models;

import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    public LinkedList<Card> cardList;

    public Deck() {
        this.initialize();
        this.shuffle();
    }

    private void initialize() {
        this.cardList = new LinkedList<>();
        for (Integer suit = 0; suit < Card.SUITS_COUNT; suit++) {
            for (Integer rank = 0; rank < Card.RANKS_COUNT; rank++) {
                Card card = new Card(suit, rank);
                cardList.add(card);
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(this.cardList);
    }

    public Card draw() {
        return this.cardList.removeLast();
    }

    public void print() {
        this.cardList.forEach(card -> System.out.println(card));
    }
}
