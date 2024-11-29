package com.project.assignment.day4;

public class LeapYear {
    public static boolean year(int year){
        if(year<=1582) {
            return false;
        }
        else if((year%4==0&&year%100!=0)||(year%400==0)){

            return true;
        }

        return false;

    }
    }

