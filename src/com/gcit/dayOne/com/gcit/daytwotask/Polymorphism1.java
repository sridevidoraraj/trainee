package com.gcit.dayOne.com.gcit.daytwotask;

public class Polymorphism1 {
    //method overloading
    protected void symbol(){
        for(int i = 0 ; i<=10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public void symbol(char symbol){
        for(int n = 0; n <= 10 ; n++){
            System.out.print(symbol);
        }
    }
    public static void main(String args[]){
        Polymorphism1 p = new Polymorphism1();
        p.symbol();
        p.symbol('c');

    }
}
