package com.gcit.daytwo;

public class SubClass1 extends Polymorphism2 {

    public void display(){
        System.out.println("child class");
    }
    public static void main(String args[]){
        SubClass1 sc = new SubClass1();
        sc.display();
        Polymorphism2 p2= new Polymorphism2();
        p2.display();

    }
}
