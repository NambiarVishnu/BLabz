package com.project.assignment.day8;

public class CountVowCons {
    public static void vowelConstant(String word){
        int vowel=0;
        int constant=0;
        word = word.toLowerCase();

        for(char c:word.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowel++;
            }else{
                constant++;
            }

        }
        System.out.println("vowel: "+vowel);
        System.out.println("Constant: "+constant);


    }
}
