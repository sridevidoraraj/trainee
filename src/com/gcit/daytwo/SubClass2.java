package com.gcit.daytwo;

public class SubClass2 extends Abstraction {

    public void square(){
        System.out.println("square");
    }
    public void rectangle(){
        System.out.println("rectangle");
    }
    public static void main(String args[]){
        SubClass2 s2 = new SubClass2();
        s2.square();
        s2.rectangle();

    }
}
