package com.project.assignment;

import java.util.Scanner;
import com.project.assignment.day1.*;
import com.project.assignment.day2.OddEven;
import com.project.assignment.day5.Factorial;

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
import static com.project.assignment.day3.SchoolResult.calculateClassSummary;
import static com.project.assignment.day3.SchoolResult.displayStudentResults;
import static com.project.assignment.day3.TempConversion.coversion;
import static com.project.assignment.day4.EvenOdd.evenOdd;
import static com.project.assignment.day4.LeapYear.year;
import static com.project.assignment.day5.Factorial.factorial;
import static com.project.assignment.day5.PowerOf2.power;
import static com.project.assignment.day5.Prime.prime;
import static com.project.assignment.day5.PrimeRange.range;

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

//        circle(5.0f);

        String schoolName = "New School Of Learning";
        String className = "Class XI";

        // Input for 3 students
        System.out.print("Enter name of Student 1: ");
        String student1 = sc.nextLine();
        System.out.println("Enter marks for " + student1 + " (out of 50):");
        System.out.print("Physics: ");
        double physics1 = sc.nextDouble();
        System.out.print("Chemistry: ");
        double chemistry1 = sc.nextDouble();
        System.out.print("Mathematics: ");
        double maths1 = sc.nextDouble();
        sc.nextLine();
        System.out.print("\nEnter name of Student 2: ");
        String student2 = sc.nextLine();
        System.out.println("Enter marks for " + student2 + " (out of 50):");
        System.out.print("Physics: ");
        double physics2 = sc.nextDouble();
        System.out.print("Chemistry: ");
        double chemistry2 = sc.nextDouble();
        System.out.print("Mathematics: ");
        double maths2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("\nEnter name of Student 3: ");
        String student3 = sc.nextLine();
        System.out.println("Enter marks for " + student3 + " (out of 50):");
        System.out.print("Physics: ");
        double physics3 = sc.nextDouble();
        System.out.print("Chemistry: ");
        double chemistry3 = sc.nextDouble();
        System.out.print("Mathematics: ");
        double maths3 = sc.nextDouble();
        sc.nextLine();

        displayStudentResults(schoolName, student1, className, physics1, chemistry1, maths1);
        displayStudentResults(schoolName, student2, className, physics2, chemistry2, maths2);
        displayStudentResults(schoolName, student3, className, physics3, chemistry3, maths3);

        calculateClassSummary(physics1, chemistry1, maths1,
                physics2, chemistry2, maths2,
                physics3, chemistry3, maths3);

        sc.close();
    }





        /*---------------------------DAY-4--------------------------*/

//        evenOdd(6);

//        boolean result=year(2000);
//        System.out.println("LeapYear? "+result);







        /*----------------------------DAY-5-----------------------------*/
//        int n=sc.nextInt();
//        power(n);

//        int n=sc.nextInt();
//        factorial(n);

//        int n=sc.nextInt();
//        boolean result=prime(n);
//        System.out.println(result);

//        int n=sc.nextInt();
//        range(n);



    }
