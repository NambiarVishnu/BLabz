package com.project.assignment.day8;

import java.util.Arrays;

public class StringAnagram {
    public static boolean anagrams(String word1,String word2) {

        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }

            }


        return true;

    }

    public static void main(String[] args) {
        String word1="Vijhnu";
        String word2="Vishnu";
        boolean result =anagrams(word1,word2);
        if(result){
            System.out.println("Anagrasms");
        }else{
            System.out.println("Not an anagrams");
        }
    }
}
