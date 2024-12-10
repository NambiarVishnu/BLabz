package com.project.assignment.day8;

public class SubString {
    public static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        // Loop to find all occurrences of the substring in the main string
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;  // Increment count for each occurrence found
            index++;  // Move the index to the next character after the found substring
        }

        return count;
    }
}
