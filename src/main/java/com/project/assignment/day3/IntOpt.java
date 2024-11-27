package com.project.assignment.day3;

public class IntOpt {
    public static void opt(int a,int b, int c){
        int result1 = a+b*c;
        System.out.println("a+b*c : "+result1);
        int result2 =  a * b + c;
        System.out.println("a+b*c : "+result2);
        int result3 =   c + a / b;
        System.out.println(" c + a / b : "+result3);
        int result4 =   a % b + c;
        System.out.println("  a % b + c : "+result4);
    }
}
