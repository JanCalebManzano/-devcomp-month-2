package com.devcomp.models;

public class Card {
    public int suit;
    public int rank;

    public static final String[] SUITS = new String[]{"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
    public static final String[] RANKS = new String[]{"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};
    public static final int SUITS_COUNT = SUITS.length;
    public static final int RANKS_COUNT = RANKS.length;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("[SUIT:%s][RANK:%s]", Card.SUITS[this.suit], Card.RANKS[this.rank]);
    }
}
