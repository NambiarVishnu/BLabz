package com.project.assignment.day2;

public class CompoundOperator {
    public static int [] comoperator(int a, int b, int c,int d){
        a+=2;
        b-=1;
        c*=2;
        d%=2;

        return new int[]{a,b,c,d};
    }
}
