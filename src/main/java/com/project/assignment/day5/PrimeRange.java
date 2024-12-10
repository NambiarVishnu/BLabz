package com.project.assignment.day5;

public class PrimeRange {
    public static void range(int n){
        int i=2;
        while(i<=n) {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }if(isPrime) {
                    System.out.println("Prime: " + i);
                }
            i++;
            }

        }

    }
