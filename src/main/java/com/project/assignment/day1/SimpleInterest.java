package com.project.assignment.day1;

public class SimpleInterest {

    public static float interest(int principal,float rate,float n){
        float result=0.0f;
        result=(principal*rate*n)/100;
        return result;
    }
}
