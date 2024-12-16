package com.project.assignment.day5;
import java.util.Random;
import java.util.Scanner;

public class GamingSimulator {

        public static void simulate(int stake, int goal, int trials) {
            int numWins = 0;
            int totalBets = 0;
            for (int i = 0; i < trials; i++) {
                int currentStake = stake;
                int betsMade = 0;

                while (currentStake > 0 && currentStake < goal) {
                    betsMade++;
                    if (Math.random() < 0.5) {
                        currentStake++;
                    } else {
                        currentStake--;
                    }
                }
                if (currentStake == goal) {
                    numWins++;
                }

                totalBets += betsMade;
            }
            double percentWin = (double) numWins / trials * 100;
            double avgBets = (double) totalBets / trials;
            System.out.println("Number of times won: " + numWins);
            System.out.println("Percent Win: " + percentWin + "%");
            System.out.println("Average number of bets made: " + avgBets);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter initial stake (in INR): ");
            int stake = scanner.nextInt();

            System.out.print("Enter goal (in INR): ");
            int goal = scanner.nextInt();

            System.out.print("Enter number of trials: ");
            int trials = scanner.nextInt();
            simulate(stake, goal, trials);

            scanner.close();
        }
    }


