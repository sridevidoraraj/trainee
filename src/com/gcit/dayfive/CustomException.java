package com.gcit.dayfive;
//Custom Exception
public class CustomException extends Exception {
    CustomException(String str) {
        super(str);
    }

    //public class ChainedExcep
    //{
    public static void main(String[] args) throws CustomException {
        try {
            int x = 10 / 0;
            System.out.println("Result: " + x);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            throw new CustomException("Chained Exception");
        }
    }
}

