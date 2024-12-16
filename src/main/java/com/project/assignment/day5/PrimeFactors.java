package com.project.assignment.day5;
import java.util.Scanner;

public class PrimeFactors {
    public static void primeFactors(int N) {
            while (N % 2 == 0) {
                System.out.print(2 + " ");
                N /= 2;
            }
            for (int i = 3; i * i <= N; i += 2) {
                while (N % i == 0) {
                    System.out.print(i + " ");
                    N /= i;
                }
            }
            if (N > 2) {
                System.out.print(N);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            System.out.print("Prime factors of " + n+ " are: ");
            primeFactors(n);

        }
    }
