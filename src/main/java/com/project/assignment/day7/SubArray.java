package com.project.assignment.day7;

public class SubArray {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] second = new int[4];
        System.arraycopy(first, 2, second, 0, 4);
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + " ");
        }
    }

}
