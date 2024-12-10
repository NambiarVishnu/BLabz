package com.project.assignment.day5;

public class Armstrong {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        return sum == originalNum;
    }
}
