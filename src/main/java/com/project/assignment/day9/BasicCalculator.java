package com.project.assignment.day9;

import java.util.Scanner;

public class BasicCalculator {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error! Division by zero.");
            return Double.NaN;
        } else {
            return x / y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exit");
                break;
            }
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            switch (choice) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                    break;
                case 4:
                    double result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please select a valid operation.");
            }
        }

        scanner.close();
    }

}
