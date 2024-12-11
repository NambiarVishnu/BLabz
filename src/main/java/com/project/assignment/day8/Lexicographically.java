package com.project.assignment.day8;

import java.util.Arrays;

public class Lexicographically {
        public static void main(String[] args) {
            String word1 = "banana";
            String word2 = "apple";

            int comparison = word1.compareTo(word2);
            if (comparison < 0) {
                System.out.println("word1 is lexicographically smaller than word2.");
            } else if (comparison > 0) {
                System.out.println("word1 is lexicographically greater than word2.");
            } else {
                System.out.println("word1 is lexicographically equal to word2.");
            }
        }
    }

