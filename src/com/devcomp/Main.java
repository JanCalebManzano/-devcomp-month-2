package com.devcomp;

import com.devcomp.models.Deck;
import com.devcomp.models.Player;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Player.count = Player.getPlayerCount();

        Deck deck = new Deck();
        List<Player> players = Player.initialize(deck);
    }

    private static void printPlayerHands(List<Player> players) {
        System.out.println("\nPlayers' hand: ");
        players.forEach(player -> System.out.println("Player: " + player.hand));
    }

}
