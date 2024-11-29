package com.project.assignment.day4;

public class Percentage {
    public static void percentage(int number){
        if(number>=90){
            System.out.println("Grade A");
        }else if((number>=80 && number<=89)){

            System.out.println("Grade B");


        }else if(number>=70 && number<=79){
            System.out.println("Grade C");

        }else{
            System.out.println("Grade D");

        }
    }
}
