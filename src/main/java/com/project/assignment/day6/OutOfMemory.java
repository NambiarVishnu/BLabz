package com.project.assignment.day6;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();

        try {
            while (true) {
                // Continuously create large arrays of integers
                // Each array of size 10 million ints consumes a large amount of memory
                int[] largeArray = new int[10_000_000];  // Each array takes up about 40MB of memory (int = 4 bytes)
                list.add(largeArray);  // Keep adding arrays to the list, never releasing memory
                System.out.println("Created array of size 10 million. Total arrays created: " + list.size());
            }
        } catch (OutOfMemoryError e) {
            // Catch the OutOfMemoryError and print a message
            System.out.println("OutOfMemoryError caught! The JVM ran out of memory.");
        }
    }
}
