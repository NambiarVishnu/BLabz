package com.project.assignment.day2;

public class Max {
    public static int max(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>a&&b>c){
            return b;
        }else{
            return c;
        }

    }
}

