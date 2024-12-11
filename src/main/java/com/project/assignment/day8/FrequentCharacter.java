package com.project.assignment.day8;

import java.util.HashMap;
import java.util.Map;

public class FrequentCharacter {
    public char frequent(String word) {
        char[] arr = word.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        char maxVal = '\0';
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxVal = entry.getKey();

            }
        }
        return maxVal;

    }
}
