package com.project.assignment.day9;

import java.util.Scanner;

public class FibonacciGenerator {
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
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        fib( n);
    }
}
