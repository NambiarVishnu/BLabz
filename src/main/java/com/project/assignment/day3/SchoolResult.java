package com.project.assignment.day3;

public class SchoolResult {
    public static double calculatePercentage(double marks, double totalMarks) {
        return (marks / totalMarks) * 100;
    }

    // Method to display individual student results
    public static void displayStudentResults(String schoolName, String studentName, String className,
                                             double physicsMarks, double chemistryMarks, double mathsMarks) {
        double totalMarks = 50; // Total marks per subject
        double totalObtained = physicsMarks + chemistryMarks + mathsMarks; // Sum of marks obtained
        double totalPercentage = calculatePercentage(totalObtained, totalMarks * 3); // Total percentage

        System.out.println("\n" + schoolName);
        System.out.println("Student Name: " + studentName);
        System.out.println("Class: " + className);
        System.out.println("=".repeat(50));
        System.out.printf("%-15s%-20s%-20s\n", "Subject", "Marks Obtained", "Percentage (%)");
        System.out.println("=".repeat(50));

        String[] subjects = {"Physics", "Chemistry", "Mathematics"};
        double[] marks = {physicsMarks, chemistryMarks, mathsMarks};
        for (int i = 0; i < subjects.length; i++) {
            double percentage = calculatePercentage(marks[i], totalMarks);
            System.out.printf("%-15s%-20.2f%-20.2f\n", subjects[i], marks[i], percentage);
        }

        System.out.println("=".repeat(50));
        System.out.printf("%-15s%-20.2f%-20.2f\n", "Total Marks", totalObtained, totalPercentage);
        System.out.println("=".repeat(50));
    }

    // Method to calculate class summary
    public static void calculateClassSummary(double physics1, double chemistry1, double maths1,
                                             double physics2, double chemistry2, double maths2,
                                             double physics3, double chemistry3, double maths3) {
        double totalPhysics = physics1 + physics2 + physics3;
        double totalChemistry = chemistry1 + chemistry2 + chemistry3;
        double totalMathematics = maths1 + maths2 + maths3;

        double avgPhysics = totalPhysics / 3;
        double avgChemistry = totalChemistry / 3;
        double avgMathematics = totalMathematics / 3;
        double overallAvg = (totalPhysics + totalChemistry + totalMathematics) / 9;

        System.out.println("\nClass Summary");
        System.out.println("=".repeat(50));
        System.out.printf("%-15s%-20s\n", "Subject", "Average Marks");
        System.out.println("=".repeat(50));
        System.out.printf("%-15s%-20.2f\n", "Physics", avgPhysics);
        System.out.printf("%-15s%-20.2f\n", "Chemistry", avgChemistry);
        System.out.printf("%-15s%-20.2f\n", "Mathematics", avgMathematics);
        System.out.println("=".repeat(50));
        System.out.printf("%-15s%-20.2f\n", "Overall Average", overallAvg);
        System.out.println("=".repeat(50));
    }
}
