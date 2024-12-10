package com.project.assignment.day8;

public class Palindrome {
    public static boolean palindrome(String word ){
        char []c=word.toCharArray();
        for(int i=0;i<word.length();i++){
            if(c[i]!=c[word.length()-1-i]){
                return false;
            }
        }
        return true;
    }
}
