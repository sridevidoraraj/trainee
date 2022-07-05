package com.gcit.dayThree;
//super keyword subclass
public class supersubclass extends superKeyword{
    public void display(){
        System.out.println("subclass " +(super.a + super.b));
        super.display();
    }
    public static void main(String args[]){
        supersubclass s = new supersubclass();
        s.display();
    }
}
