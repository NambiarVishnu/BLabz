package com.project.assignment.day5;

public class Prime {
    public static boolean prime(int n){
        if(n<2){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }

            }
        }
        return true;
    }
}
