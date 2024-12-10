package com.project.assignment.day7;

import java.util.ArrayList;

public class PrimePalindrome {
    public static void range(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }
        for (int i = 0; i < primeNumbers.size(); i++)
                if (isPalindrome(primeNumbers.get(i))) {
            System.out.println(primeNumbers.get(i) + " is palindrome");
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

    public static boolean isPalindrome(int i){
        String number=String.valueOf(i);
        if(number.length()==1){
            return true;
        }
        char [] arr = number.toCharArray();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[arr.length-j-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 100;
        range(number);
    }
}

