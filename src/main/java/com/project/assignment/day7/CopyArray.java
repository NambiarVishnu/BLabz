package com.project.assignment.day7;

public class CopyArray {

    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] second = new int[first.length];
        System.arraycopy(first, 0, second, 0, first.length);
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + " ");
        }
    }
}
