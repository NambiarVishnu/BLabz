package com.project.assignment.day6;

public class GarbageCollection {
        public static void main(String[] args) {
            int iterations = 10000; // Number of iterations to simulate memory usage
            int arraySize = 100000; // Size of the array in each iteration (this controls memory usage)

            printMemoryStatus();
            for (int i = 0; i < iterations; i++) {
                int[] randomArray = new int[arraySize]; // Allocate memory for the array
                fillArrayWithRandomNumbers(randomArray); // Fill the array with random numbers
                // Discard the reference, making the object eligible for GC
                randomArray = null;

                // Suggest garbage collection after every 1000 iterations
                if (i % 1000 == 0) {
                    System.gc(); // Request garbage collection
                    System.out.println("GC Suggested at iteration: " + i);
                    printMemoryStatus();
                }
            }

            // Final memory status after the loop
            printMemoryStatus();
        }

        // Method to fill the array with random numbers (just to simulate memory usage)
        private static void fillArrayWithRandomNumbers(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
        }

        // Method to print the current memory usage and heap status
        private static void printMemoryStatus() {
            Runtime runtime = Runtime.getRuntime();
            long usedMemory = runtime.totalMemory() - runtime.freeMemory();
            long freeMemory = runtime.freeMemory();
            long maxMemory = runtime.maxMemory();
            long totalMemory = runtime.totalMemory();

            System.out.println("Used Memory: " + usedMemory / (1024 * 1024) + " MB");
            System.out.println("Free Memory: " + freeMemory / (1024 * 1024) + " MB");
            System.out.println("Total Memory: " + totalMemory / (1024 * 1024) + " MB");
            System.out.println("Max Memory: " + maxMemory / (1024 * 1024) + " MB");
            System.out.println("--------------------------");
        }
    }


