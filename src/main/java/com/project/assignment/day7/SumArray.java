package com.project.assignment.day7;

public class SumArray {
    public static void main(String [] args){
        int[] numbers = {5,4,3,2,1};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
