package com.devcomp;

import com.devcomp.models.Deck;
import com.devcomp.models.Player;
import com.devcomp.utils.Logics;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Player.count = Player.getPlayerCount();
        Deck deck = new Deck();
        List<Player> players = Player.initialize(deck);
//        test();
    }

    private static void printPlayerHands(List<Player> players) {
        System.out.println("\nPlayers' hand: ");
    }

    public static void test() {
        Logics logic = new Logics();

//        System.out.println(logic.getCombination(52, 5));
//        System.out.println(logic.getStraightFlashChance());
    }

}
