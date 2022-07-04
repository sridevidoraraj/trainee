package com.gcit.dayOne.com.gcit.daytwotask;

public class SubClass extends Inheritance{
    public void mul(int a, int b){
        System.out.println("multiplication: " +(a*b));
    }
    public static void main(String args[]){
        SubClass sb = new SubClass();
        sb.add(10,20);
        sb.mul(20,30);
    }
}
