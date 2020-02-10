package com.devcomp.models;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Player {
    public Set<Card> hand;

    public Player(Set<Card> hand) {
        this.hand = hand;
    }

    public static List<Player> initialize(int count, Deck deck) {
        return IntStream.range(0, count)
            .mapToObj(index -> new Player(deck.getHand()))
            .collect(Collectors.toList());
    }
}
