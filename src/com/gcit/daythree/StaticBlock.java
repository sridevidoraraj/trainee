package com.gcit.daythree;
//static block
public class StaticBlock {

    static int a =10;
    static int b =20;
    static int c = a+b;
    static{
        System.out.println("static block: ");
        System.out.println(a);
    }
    static{
        System.out.println("static block: ");
        System.out.println(b=a*10);
    }
    static void display(){
        System.out.println(c);
    }
    public static void main(String args[]){
        display();
    }
}
