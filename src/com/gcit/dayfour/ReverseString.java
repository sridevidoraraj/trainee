package com.gcit.dayfour;

//3. Reverse a String using for loop
public class ReverseString {
    public static void main(String args[]){
        String s = "reverse string";
       for(int i = s.length()-1; i>=0; i--){
           System.out.print(s.charAt(i));
       }
    }
}
