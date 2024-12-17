package com.project.assignment.day7;
import java.util.*;


public class Gaming2D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the initial stake (in INR): ");
            int stake = sc.nextInt();
            System.out.print("Enter the goal (in INR): ");
            int goal = sc.nextInt();
            System.out.print("Enter the number of simulations (trials): ");
            int trails = sc.nextInt();
            int[][] results = new int[trails][2];
            for (int i = 0; i < trails; i++) {
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
                    results[i][0] = 1;
                } else {
                    results[i][1] = 1;
                }
                System.out.println("Simulation " + (i + 1) + ": Bets made = " + betsMade +
                        ", Won = " + (results[i][0] == 1 ? "Yes" : "No") +
                        ", Lost = " + (results[i][1] == 1 ? "Yes" : "No"));
            }

            int totalWon = 0, totalLost = 0;
            for (int i = 0; i < trails; i++) {
                totalWon += results[i][0];
                totalLost += results[i][1];
            }
            System.out.println("\nTotal Games Won: " + totalWon);
            System.out.println("Total Games Lost: " + totalLost);
        }
    }


