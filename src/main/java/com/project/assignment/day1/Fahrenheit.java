package com.project.assignment.day1;

public class Fahrenheit {

    public double fahrenheit(double celsius){
        double F;
        F=(celsius * 9/5) + 32;
        return F;
    }
    public double Celsius(double fahrebheit){
        double C;
        C=(fahrebheit - 32)*5/9;
        return C;
    }
}
