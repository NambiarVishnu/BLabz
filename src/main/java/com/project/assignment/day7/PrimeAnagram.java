package com.project.assignment.day7;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAnagram {
    public static void range(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        for (int i = 0; i < primeNumbers.size(); i++) {
            for (int j = i + 1; j < primeNumbers.size(); j++) {
                if (isAnagram(primeNumbers.get(i), primeNumbers.get(j))) {
                    System.out.println(primeNumbers.get(i) + " and " + primeNumbers.get(j) + " are anagrams.");
                }
            }
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isAnagram(int num1, int num2) {
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        int number = 100;
        range(number);
    }
}
