package com.devcomp.models;

public class Card {
    public Integer suit;
    public Integer rank;

    public static final String[] SUITS = new String[]{"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
    public static final String[] RANKS = new String[]{"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
    public static final Integer SUITS_COUNT = SUITS.length;
    public static final Integer RANKS_COUNT = RANKS.length;

    public Card(Integer suit, Integer rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("[SUIT:%s][RANK:%s]", Card.SUITS[this.suit], Card.RANKS[this.rank]);
    }
}
