package com.gcit.dayTwo;

public class Constructor {
    //non parameterized constructor
    int n;
    String name;
    /*Constructor(){
        System.out.println("constructor called");

    }
    public static void main(String args[]){
        Constructor c= new Constructor();
        System.out.println(c.n);
        System.out.println(c.name);
    }*/

    //parameterized constructor
    Constructor(int n, String name){
        this.n = n;
        this.name = name;
    }
    public static void main(String args[]) {
        Constructor c = new Constructor(1,"rk");
        System.out.println("no : " + c.n + " name : " +c.name );

    }

}
