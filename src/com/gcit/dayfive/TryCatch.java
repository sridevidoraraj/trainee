package com.gcit.dayfive;
//Java try-catch block
public class TryCatch {
    public static void main(String args[]){
        int number1 = 20;
        int number2 = 0;
        try{
            System.out.println(" division :" +(number1/number2));
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("end");
    }
}
