package com.project.assignment.day5;

public class Reverse {

    public static int reverseNumber(int number){
        int rev=0;

        while(number!=0){
            int lastdigit=number%10;
            rev=rev*10+lastdigit;
            number=number/10;
        }
        return rev;
    }
}
