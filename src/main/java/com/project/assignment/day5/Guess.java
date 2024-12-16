package com.project.assignment.day5;

import java.util.Scanner;


public class Guess {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int low = 1;
            int high = 100;
            String feedback = "";

            System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
            System.out.println("Please provide feedback on my guess:");
            System.out.println("'h' for high, 'l' for low, 'c' for correct.");

            while (!feedback.equals("c")) {
                int guess = (low + high) / 2;
                System.out.println("Is your number " + guess + "?");
                feedback = scanner.nextLine().toLowerCase();
                if (feedback.equals("h")) {
                    high = guess - 1;
                }
                else if (feedback.equals("l")) {
                    low = guess + 1;
                }

                else if (feedback.equals("c")) {
                    System.out.println("Yup! I guessed your number: " + guess);
                } else {
                    System.out.println("Invalid feedback! Please enter 'h', 'l', or 'c'.");
                }
            }

        }
    }



