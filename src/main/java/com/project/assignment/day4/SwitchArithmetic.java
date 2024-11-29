package com.project.assignment.day4;

public class SwitchArithmetic {
    public static void arithmetic(int a, int b, char z){
        switch(z){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }
}
