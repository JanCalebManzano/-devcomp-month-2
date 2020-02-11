package com.devcomp.models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Player {
    public Set<Card> hand;

    public static int count;



    public Player() {
        this.hand = new HashSet<>();
    }

    public static int getPlayerCount() throws IOException {
        System.out.print("PLAYERS: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt((reader.readLine()));
    }

    public static List<Player> initialize(Deck deck) {
        List<Player> players = IntStream.range(0, Player.count)
            .mapToObj(index -> new Player())
            .collect(Collectors.toList());

        IntStream.range(0, (Player.count * 5))
            .forEach(index -> {
                players.get(index % Player.count).hand.add(deck.draw());
            });

        return players;
    }
}
