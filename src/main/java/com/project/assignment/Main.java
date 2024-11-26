package com.project.assignment;

import java.util.Scanner;
import com.project.assignment.day1.*;
import com.project.assignment.day2.OddEven;

import static com.project.assignment.day1.Average.average;
import static com.project.assignment.day1.KmtoMiles.convert;
import static com.project.assignment.day2.AddSub.addsub;
import static com.project.assignment.day2.Bitwise.bitwise;
import static com.project.assignment.day2.CompoundOperator.comoperator;
import static com.project.assignment.day2.LeapYear.leapyear;
import static com.project.assignment.day2.Max.max;
import static com.project.assignment.day2.MulTable.table;
import static com.project.assignment.day2.OddEven.oddeven;
import static com.project.assignment.day2.Shifts.shift;
import static com.project.assignment.day2.Ternary.min;
import static com.project.assignment.day2.Toggle.toggle;
import static com.project.assignment.day3.Circle.circle;
import static com.project.assignment.day3.IntOpt.opt;
import static com.project.assignment.day3.Places.place;
import static com.project.assignment.day3.Print.reverse;
import static com.project.assignment.day3.TempConversion.coversion;

public class Main {
    public static void main(String[] args) {

       // System.out.println("Welcome to Bridgelabz!");

//        Add instance =new Add();
//        int result=instance.add(5,6);
//        System.out.println(result);

//        Fahrenheit instance =new Fahrenheit();
//        double celsius=50.01d;
//        double result=instance.fahrenheit(celsius);
//        System.out.println(result);

//        Circle instance =new Circle();
//        float result=instance.areaCircle(5.2f);
//        System.out.println(result);

//        Cylinder instance =new Cylinder();
//        float result=instance.cylinder(5.2f,6.8f);
//        System.out.println(result);

           Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the principal amount:");
//        int principal=sc.nextInt();
//        System.out.println("Enter the interest rate :");
//
//        float rate=sc.nextFloat();
//        System.out.println("Enter the time duration in months");
//        float n=sc.nextFloat();
//
//
//        SimpleInterest instance =new SimpleInterest();
//        float result=instance.interest(principal,rate,n);
//        System.out.println(result);

//        Perimeter instance=new Perimeter();
//
//        int result=instance.rectangle(5,6);
//        System.out.println("Perimeter of rectangle: "+result);

//        PowerExponent instance =new PowerExponent();
//        double result=instance.power(5.00d,2.0d);
//        System.out.println(result);

//          float result=average(5,6,4);
//          System.out.println(result);


//            System.out.println(" Enter the Kilometer");
//            double km=sc.nextDouble();
//            double result = convert(km);
//            System.out.println("Miles: "+result);

        /* ----------------------------------DAY-2-------------------------------------------*/

//        int a=sc.nextInt();
//        int b= sc.nextInt();
//
//        int[] result=addsub(a,b);
//
//
//        System.out.println("Sum: "+result[0]);
//        System.out.println("diff: "+result[1]);

//        int a=sc.nextInt();
//        table(a);

//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//
//        int result=max(a,b,c);
//        System.out.println(result);

//        boolean result=leapyear(2023);
//        System.out.println(result);


//        int[] result= comoperator(5,4,2,4);
//        System.out.println("+= :"+result[0]);
//        System.out.println("-= :"+result[1]);
//        System.out.println("*= :"+result[2]);
//        System.out.println("%= :"+result[3]);

//        boolean value =true;
//        toggle(value);

//        bitwise(5,6);

//        shift(5);

//        boolean result=oddeven(4);
//        System.out.println(result);

//int result=min(6,5);
//System.out.print(result);

        /*----------------------DAY-3---------------------------------------*/

//        reverse("Anthony","Akbar","Amar");

//        place("Srinagar", "Jabalpur", "Jaisalmer", "Chidambaram", "Shillong");

//opt(5,6,7);

//        float result=sc.nextFloat();
//        coversion(result);

        circle(5.0f);


    }
}