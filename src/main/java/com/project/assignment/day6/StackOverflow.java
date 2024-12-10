package com.project.assignment.day6;

public class StackOverflow {
    public static void recursiveFunction() {
        System.out.println("Recursion depth: " + Thread.currentThread().getStackTrace().length);
        recursiveFunction();
    }

}