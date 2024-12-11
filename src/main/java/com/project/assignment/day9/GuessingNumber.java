package com.project.assignment.day9;

import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void feedback(int x, int randomNumber){
        if(x>randomNumber){
            System.out.println("low");
        }else if(x<randomNumber){
            System.out.println("high");
        }else{
            System.out.println("Correct");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        int x=sc.nextInt();
        feedback(x,randomNumber);

    }
}
