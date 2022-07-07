package com.gcit.daythree;
//super keyword subclass
public class SuperSubclass extends SuperKeyword {
    public void display(){
        System.out.println("subclass " +(super.a + super.b));
        super.display();
    }
    public static void main(String args[]){
        SuperSubclass s = new SuperSubclass();
        s.display();
    }
}
