package com.gcit.dayfive;
import java.io.IOException;
//Java throws keyword
public class ThrowsKeyword {
    static void display() throws IOException
    {
        System.out.println("Hello Java");
        throw new IOException();
    }
    public static void main(String[] args) {
        ThrowsKeyword obj = new ThrowsKeyword();
        try {
            obj.display();
        }
        catch (IOException e) {
            System.out.println("Caught an exception: \n" +e);
        }
    }
}
