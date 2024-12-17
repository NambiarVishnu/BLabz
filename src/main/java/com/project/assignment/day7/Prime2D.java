package com.project.assignment.day7;
import java.util.ArrayList;


public class Prime2D {
    public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            ArrayList<Integer>[][] primeNumbers2D = new ArrayList[10][];
            for (int i = 0; i < 10; i++) {
                ArrayList<Integer> primesInRange = new ArrayList<>();
                int start = i * 100;
                int end = (i + 1) * 100 - 1;
                for (int num = start; num <= end; num++) {
                    if (isPrime(num)) {
                        primesInRange.add(num);
                    }
                }
                primeNumbers2D[i] = new ArrayList[]{primesInRange};
            }
            for (int i = 0; i < 10; i++) {
                System.out.print("Range " + (i * 100) + "-" + (i * 100 + 99) + ": ");
                for (int prime : primeNumbers2D[i][0]) {
                    System.out.print(prime + " ");
                }
                System.out.println();
            }
        }
    }

