package com.project.assignment.day7;
import java.util.*;


public class ShuffleCards {
     public static void main(String[] args) {
            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

            List<String> deck = new ArrayList<>();
            for (String suit : suits) {
                for (String rank : ranks) {
                    deck.add(rank + " of " + suit);
                }
            }
            Collections.shuffle(deck);
            List<List<String>> players = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                players.add(new ArrayList<>());
            }

            int cardIndex = 0;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 4; j++) {
                    players.get(j).add(deck.get(cardIndex));
                    cardIndex++;
                }
            }
            for (int i = 0; i < 4; i++) {
                System.out.println("Player " + (i + 1) + "'s cards:");
                for (String card : players.get(i)) {
                    System.out.println(card);
                }
                System.out.println();
            }
        }
    }


