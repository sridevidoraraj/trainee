package com.gcit.dayThree;
//this keyword
public class thisKeyword {
    int a,b;
    thisKeyword(int a, int b){
        this.a = a;
        this.b = b;
        System.out.print("before adding :" );
        System.out.println(" a : " + a + " b : " + b);
        add(this);
        System.out.print("after adding :" );
        System.out.print(" a : " + this.a + " b : " + this.b);
    }
    public void add(thisKeyword t){
        t.a += 2;
        t.b += -2;
    }
    public static void main(String args[]){
        thisKeyword t = new thisKeyword(1, 3);
    }



}
