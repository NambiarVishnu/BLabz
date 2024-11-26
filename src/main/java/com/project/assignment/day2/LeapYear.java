package com.project.assignment.day2;

public class LeapYear {

    public static boolean leapyear(int year){
        if((year%4==0&&year%100!=0)||(year%400==0)){

                return true;
            }

        return false;

    }
}
