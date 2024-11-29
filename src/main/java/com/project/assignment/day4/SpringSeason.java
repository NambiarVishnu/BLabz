package com.project.assignment.day4;

public class SpringSeason {

    public static boolean season(int month,int day){
        return (month > 2 || (month == 2 && day >= 12)) && (month < 4 || (month == 4 && day <= 11));
    }

    }


