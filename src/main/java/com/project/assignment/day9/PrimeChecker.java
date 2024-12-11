package com.project.assignment.day9;

import java.util.Scanner;

public class PrimeChecker {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean result = prime(n);
        if(result){
            System.out.println("Prime");
        }else{
            System.out.println("Not a prime");
        }
    }
}
