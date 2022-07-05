package com.gcit.dayTwo;

public class constructor {
    //non parameterized constructor
    int n;
    String name;
    /*constructor(){
        System.out.println("constructor called");

    }
    public static void main(String args[]){
        constructor c= new constructor();
        System.out.println(c.n);
        System.out.println(c.name);
    }*/

    //parameterized constructor
    constructor(int n, String name){
        this.n = n;
        this.name = name;
    }
    public static void main(String args[]) {
        constructor c = new constructor(1,"rk");
        System.out.println("no : " + c.n + " name : " +c.name );

    }

}
