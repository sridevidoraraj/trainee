package com.gcit.dayOne.com.gcit.daytwotask;

public class Subclass1 extends Polymorphism2 {
    public void display(){
        System.out.println("child class");
    }
    public static void main(String args[]){
        Subclass1 sc = new Subclass1();
        sc.display();
        Polymorphism2 p2= new Polymorphism2();
        p2.display();

    }
}
