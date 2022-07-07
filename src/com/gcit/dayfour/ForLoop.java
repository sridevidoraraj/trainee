package com.gcit.dayfour;
//2. Display numbers from 1 to 5 and sum of numbers using for loop.
public class ForLoop {
    public static void main(String args[]){
        int n =5;
        int sum = 0;
        System.out.println("first " + n + "numbers are: ");

        for(int i = 1; i<=n; i++){
            System.out.println(i+ " ");
            sum = sum+i;
        }
        System.out.println("sum of " +n+ " numbers : " +sum );
    }
}
