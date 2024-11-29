package com.project.assignment.day4;

public class Largest3 {
    public static int largest(int a, int b ,int c){
        if(a>b &&a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }

        return c;

    }
}
