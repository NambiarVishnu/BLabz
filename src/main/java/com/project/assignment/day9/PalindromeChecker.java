package com.project.assignment.day9;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean palindrome(String word ){
        char []c=word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(c[i]!=c[word.length()-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        boolean result=palindrome(s);
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}

