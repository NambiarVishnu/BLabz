package com.project.assignment.day9;

import java.util.Scanner;

public class MaxThree {
    public static int max(int x, int y, int z){
        return (x > y && x > z) ? x : (y > z ? y : z);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();


        int maxVal = max(x,y,z);
        System.out.println(maxVal);
    }
}
