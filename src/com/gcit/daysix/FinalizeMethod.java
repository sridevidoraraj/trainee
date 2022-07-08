package com.gcit.daysix;

//Finalize Method

public class FinalizeMethod {
    public static void main(String[] args)
    {
        FinalizeMethod obj = new FinalizeMethod();
        obj = null;
        System.gc();
        System.out.println("Running garbage collector");
    }

    @Override
    protected void finalize()
    {
        try
        {
            int a = 1/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException Occured");
        }

        System.out.println("Finalize method is called");
    }
}
