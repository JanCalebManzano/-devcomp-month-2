package com.devcomp;

import com.devcomp.models.Deck;
import com.devcomp.models.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        int playerCount = Integer.parseInt(getInput("PLAYERS: "));

        Deck deck = new Deck();
        List<Player> players = Player.initialize(playerCount, deck);

        players.forEach(player -> {
            System.out.println("Player: " + player.hand);
        });
    }

    private static String getInput(String message) throws IOException {
        System.out.print(message);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }


}
