package com.project.assignment.day6;

public class MeasuringCompilerAndInterpreter {
        public static long fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        public static void main(String[] args) {
            int n = 40;
            int runs = 5;
            for (int i = 0; i < runs; i++) {
                long startTime = System.nanoTime();
                long result = fibonacci(n);
                long endTime = System.nanoTime();

                long duration = endTime - startTime;
                System.out.println("Run " + (i + 1) + " - Fibonacci(" + n + "): " + result);
                System.out.println("Time taken (nanoseconds): " + duration);
            }
        }
    }

