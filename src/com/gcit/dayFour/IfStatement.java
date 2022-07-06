package com.gcit.dayFour;

import java.util.Scanner;
//1. Write a Java program to get a number from the user and print whether it is positive or negative or zero.
// (use if, else if and else)
public class IfStatement {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number :");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("number is positive : " +n);
        }else if(n<0){
            System.out.println("number is negative: " +n);
        }else{
            System.out.println("number is zero : " +n);
        }
    }

}
