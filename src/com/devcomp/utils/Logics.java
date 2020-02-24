package com.devcomp.utils;

import com.devcomp.models.Card;
import com.devcomp.models.Player;

import java.util.*;
import java.util.stream.Collectors;

public class Logics {

    public static List<Integer> royal = Arrays.asList(8,9,10,11,12);

    public static int getCombination(Player player) {
        int total = 52 - (Player.count * player.hand.size());
        int choose = 5 - player.hand.size();

        return Combinatorics.choose(total, choose);
    }

    public static void checkHand(Set<Card> hand) {
        Set<Integer> suit = hand.stream().map(card -> card.suit).collect(Collectors.toSet());
        Set<Integer> ranks = hand.stream().map(card -> card.rank).collect(Collectors.toSet());
//        List<Integer> ranksCards = hand.stream().map(card -> card.rank).collect(Collectors.toList());
        int[] ranksCards = hand.stream().mapToInt(card -> card.rank).toArray();
        hand.stream().forEach(System.out::println);
        System.out.println(suit.toString());
        System.out.println(isRoyalPossible(suit, hand));
        System.out.println(isFourPossible(ranks));
        System.out.println(isStraightFlush(ranksCards, suit));
//        royal.stream().forEach(c -> System.out.println(Card.RANKS[c]));
    }

    public int computeRoyalFlushChance(int combination) {
        return (1 / combination) % 100;
    }

    public static boolean isRoyalPossible(Set<Integer> suit, Set<Card> hand) {
        return (suit.size() == 1 && (((Card)(hand.toArray()[hand.size()-1])).rank >= 8 && ((Card)(hand.toArray()[hand.size()-1])).rank <= 12));
    }

    public static boolean isFourPossible(Set<Integer> ranks) {
        return ranks.size() <= 2;
    }

    public static boolean isStraightFlush(int[] hand, Set<Integer> suit) {
        if (suit.size() != 1) {
            return false;
        }

        int largest = getLargest(hand);

        for (int i = 0; i < hand.length; i++) {
            if ((largest - hand[i]) > 4) {
                return false;
            }
        }

        return true;
    }



    public static int getLargest(int[] hand) {
        int max = hand[0];
        for(int i = 1; i < hand.length;i++)
        {
            if(hand[i] > max)
            {
                max = hand[i];
            }
        }
        return max;
    }

}
