package com.project.assignment.day8;

public class LargestWord {
    public static String largestW(String sentence){
        String[] words = sentence.split("\\s+");

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;  
            }
        }

        return longestWord;

    }
}
