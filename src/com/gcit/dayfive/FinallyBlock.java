package com.gcit.dayfive;
//Java finally block
public class FinallyBlock {
    public static void main(String[] args)
    {
        int a = 20, b = 30;
        try
        {
            int sum = a + b;
            System.out.println("Sum: " +sum);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block must be executed");
        }
        System.out.println("Hello Java");
    }
}
