package com.project.assignment.day5;

public class Factorial {
    public static void factorial(int n){
        if(n<1){
            System.out.println("Exit");

        }else{
            int result=1;
            int i=1;
            while(i<=n){

                result*=i;
                i++;
            }
            System.out.println("Factorial of "+n+": "+result);
        }

        }

}
