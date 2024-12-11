package com.project.assignment.day9;

public class TemperatureConverter {
    public static double fahrenheit(double celsius){
        double F;
        F=(celsius * 9/5) + 32;
        return F;
    }
    public static double celsius(double fahrebheit){
        double C;
        C=(fahrebheit - 32)*5/9;
        return C;
    }
}
