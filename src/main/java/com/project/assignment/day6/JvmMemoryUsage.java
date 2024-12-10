package com.project.assignment.day6;

public class JvmMemoryUsage {
    public  void jvm() {
        // Get the Runtime object for memory management
        Runtime runtime = Runtime.getRuntime();

        // Print the memory status before object creation
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used before creating objects: " + memoryBefore + " bytes");

        // Create an array of 1 million Integer objects
        Integer[] intArray = new Integer[1000000];

        // Fill the array with Integer objects
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(i);
        }

        // Print the memory status after object creation
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used after creating objects: " + memoryAfter + " bytes");

        // Calculate and print the memory used by the created objects
        System.out.println("Memory used by the created objects: " + (memoryAfter - memoryBefore) + " bytes");
    }
}
