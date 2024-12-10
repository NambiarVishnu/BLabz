package com.project.assignment.day8;

public class ReverseString {
    public static String reverseString(String word){
        char c[]=word.toCharArray();
        StringBuilder rev=new StringBuilder();
        for(int i=c.length-1;i>=0;i--){
            rev.append(c[i]);
        }
        return rev.toString();
    }
}
