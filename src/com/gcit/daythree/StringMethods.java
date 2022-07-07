package com.gcit.daythree;
//string methods
public class StringMethods {
    public static void main(String args[]){
        String name = "abcdef";
        char ch = name.charAt(4);
        System.out.println(ch);
        System.out.println(name.length());
        String myStr = "Hello";
        int result = myStr.codePointAt(0);
        System.out.println(result);
        int result1 = myStr.codePointBefore(4);
        System.out.println(result1);
        String str = "hello";
        String str1 = "hello";
        System.out.println(str.getBytes());
        System.out.println( str.compareTo(str1));
        System.out.println(str.equals(str1));
        String name1= "string";
        String name2= "method";
        System.out.println(name1.concat(name2));
        String myStr2 = "Hello planet earth, you are a great planet.";
        System.out.println(myStr2.indexOf("planet"));

    }
}
