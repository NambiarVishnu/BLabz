package com.project.assignment.day10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Enter the first date");
        String date1=sc.nextLine();
        System.out.println("Enter the second date");
        String date2=sc.nextLine();

        LocalDate date1Input=LocalDate.parse(date1,format);
        LocalDate date2Input = LocalDate.parse(date2,format);

        if(date1Input.isBefore(date2Input))
            System.out.println("The first date is before the second date");
        else if(date2Input.isBefore(date1Input)){
            System.out.println("The second date is before the first date");
            }
        else if(date1Input.isEqual(date2Input)) {
            System.out.println("Both dates are same");
        }




    }
}
