package com.project.assignment.day6;

public class GarbageCollectorLogs {

        public static void main(String[] args) {
            int iterations = 1000; // Number of iterations to simulate memory allocation
            int arraySize = 1000000; // Size of the array to allocate in each iteration

            // Running in a loop to allocate large arrays
            for (int i = 0; i < iterations; i++) {
                int[] randomArray = new int[arraySize]; // Allocate memory for a large array
                fillArrayWithRandomNumbers(randomArray); // Fill the array with random numbers

                // Discard the reference to the array, making it eligible for GC
//                randomArray = null;

                // Every 100 iterations, print a log message to indicate a GC cycle
                if (i % 100 == 0) {
                    System.out.println("Iteration " + i + " completed.");
                }
            }
        }

        // Method to fill the array with random numbers (just to simulate memory usage)
        private static void fillArrayWithRandomNumbers(int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 100);
            }
        }
    }


