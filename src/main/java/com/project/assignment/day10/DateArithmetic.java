package com.project.assignment.day10;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a date (yyyy-MM-dd");
        String input = sc.nextLine();

        LocalDate inputDate=LocalDate.parse(input);

        LocalDate ans=inputDate.plusDays(7).plusMonths(1).plusYears(2);

        ans=ans.minusWeeks(3);

        System.out.println("The final date: " +ans);
    }
}
