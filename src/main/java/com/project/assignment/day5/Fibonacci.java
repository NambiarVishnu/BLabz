package com.project.assignment.day5;

public class Fibonacci {
    public static void fib(int n){
        int first =0;
        int second =1;
        System.out.print(first+" "+second);
        int i=2;


        while(i<n){
            int third=second+first;
            System.out.print(" "+third);
            first=second;
            second=third;
           i++;
        }
    }
}
