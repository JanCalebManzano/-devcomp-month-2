package com.devcomp.models;

import java.util.*;

public class Deck {
    public LinkedList<Card> cardList;

    public Deck() {
        this.initialize();
        this.shuffle();
    }

    private void initialize() {
        this.cardList = new LinkedList<>();
        for (int suit = 0; suit < Card.SUITS_COUNT; suit++) {
            for (int rank = 0; rank < Card.RANKS_COUNT; rank++) {
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

    public Set<Card> getHand() {
        return new HashSet<>(Arrays.asList(this.draw(), this.draw(), this.draw(), this.draw(), this.draw()));
    }

    public void print() {
        this.cardList.forEach(System.out::println);
    }
}
