package com.project.assignment.day8;

import java.util.HashSet;

public class DuplicateString {
    public static String duplicate(String word){
        word = word.toLowerCase();  // Convert to lowercase to handle case-insensitivity
        StringBuilder str = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        char[] c = word.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (!set.contains(c[i])) {
                set.add(c[i]);
                str.append(c[i]);
            }
        }

        return str.toString();
    }
}
