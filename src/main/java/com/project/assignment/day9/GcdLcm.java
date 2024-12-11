package com.project.assignment.day9;

import java.util.Scanner;

public class GcdLcm {

    public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static int lcm(int a, int b) {
            return Math.abs(a * b) / gcd(a, b);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            int gcdValue = gcd(num1, num2);
            int lcmValue = lcm(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdValue);
            System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmValue);
     }
    }


