package com.gcit.dayTwo;

public class subclass2 extends Abstraction {
    public void square(){
        System.out.println("square");
    }
    public void rectangle(){
        System.out.println("rectangle");
    }
    public static void main(String args[]){
        subclass2 s2 = new subclass2();
        s2.square();
        s2.rectangle();

    }
}
