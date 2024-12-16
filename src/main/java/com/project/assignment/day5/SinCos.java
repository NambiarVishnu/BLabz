package com.project.assignment.day5;
import java.util.Scanner;


public class SinCos {
    public static double toRadians(double d) {
            return d * Math.PI / 180;
        }
        public static double computeSin(double x, int n) {
            x = x % (2 * Math.PI);

            double sinValue = 0;
            double term = x;
            for (int i = 1; i <= n; i++) {
                sinValue += term;
                term *= -x * x / ((2 * i) * (2 * i + 1));
            }

            return sinValue;
        }
        public static double computeCos(double x, int n) {
            x = x % (2 * Math.PI);

            double cosValue = 1;
            double term = 1;
            for (int i = 1; i <= n; i++) {
                term *= -x * x / ((2 * i - 1) * (2 * i));
                cosValue += term;
            }
            return cosValue;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter angle in degrees: ");
            double angle = scanner.nextDouble();
            System.out.print("Enter the number of terms for the Taylor series: ");
            int n = scanner.nextInt();
            double radians = toRadians(angle);
            double sinValue = computeSin(radians, n);
            double cosValue = computeCos(radians, n);
            System.out.println("sin(" + angle + " degrees) = " + sinValue);
            System.out.println("cos(" + angle + " degrees) = " + cosValue);
     }
    }


