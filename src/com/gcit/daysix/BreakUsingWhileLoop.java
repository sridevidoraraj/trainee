package com.gcit.daysix;
//break statement inside while loop
public class BreakUsingWhileLoop {

    public static void main(String[] args)
    {
        int i = 1;
        while(i <= 10){
            if(i == 5){
                i++;
                break; // Breaking the loop.
            }
            System.out.println(i);
            i++;
        }
    }
}
