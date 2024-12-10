package com.project.assignment.day6;

import java.util.ArrayList;
import java.util.List;

public class SimulateGarbageCollection {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();

        try {
            // Loop to allocate memory repeatedly by creating large arrays
            for (int i = 0; i < 1000; i++) {
                // Create a large array of integers (e.g., 10 million elements)
                int[] largeArray = new int[10_000_000];
                list.add(largeArray);  // Keep adding arrays to the list

                // Optionally print the current progress
                if (i % 100 == 0) {
                    System.out.println("Created " + i + " arrays...");
                }

                // Force garbage collection at regular intervals (for testing)
                if (i % 200 == 0) {
                    System.gc();
                }
            }
        } catch (OutOfMemoryError e) {
            // Catch the OutOfMemoryError and print a message
            System.out.println("OutOfMemoryError caught! The JVM ran out of memory.");
        }
    }
}
