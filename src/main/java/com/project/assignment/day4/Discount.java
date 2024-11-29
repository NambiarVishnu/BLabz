package com.project.assignment.day4;

public class Discount {
    public static void discount(int amount){
        double discount=(amount>=500?0.20:0.10);
        double result=amount*discount;
        System.out.println(result);
    }
}
