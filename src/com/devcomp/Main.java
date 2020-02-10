package com.devcomp;

import com.devcomp.models.Deck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        final Integer PLAYER_COUNT = Integer.parseInt(getInput("PLAYERS: "));

        Deck deck = new Deck();
        deck.print();

        System.out.println("DRAW");
        System.out.println(deck.draw());
        System.out.println(deck.draw());

        System.out.println("CARDS LEFT: " + deck.cardList.size());
    }

    private static String getInput(String message) throws IOException {
        System.out.print(message);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
