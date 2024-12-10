package com.project.assignment.day7;

public class CopyArr {
    public static void main(String[] args) {
        int[] first = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] second = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            second[i] = first[i];
        }
        System.out.print("Elements copied to the second array: ");
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + " ");
        }
    }
}
