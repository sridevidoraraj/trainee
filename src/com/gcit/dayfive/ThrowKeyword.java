package com.gcit.dayfive;
//Java throw Exception
public class ThrowKeyword {
    public static void main(String[] args)
    {
        int x = 20;
        int y = 0;
        try
        {
            int z = x/y;
            System.out.println("Result: " +z);
            throw new ArithmeticException();
        }
        catch(ArithmeticException ae){
            System.out.println("Exception caught: \n" +ae);

        }
    }
}
