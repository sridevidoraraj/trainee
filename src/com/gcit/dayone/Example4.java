package com.gcit.dayone;
//3. Create methods for add, sub, mul, div and call it in main.
public class Example4 {

    public int add(int a, int b){
        int c = a +b;
        return c;
    }
    public int sub(int a, int b){
        int c= a-b;
        return c;
    }
    public int mul(int a,int b){
        int c = a*b;
        return c;
    }
    public int div(int a, int b){
        int c = a/b;
        return c;
    }
    public static void main(String args[]){

        Example4 ex = new Example4();
        System.out.println(ex.add(10,20));
        System.out.println(ex.sub(20,10));
        System.out.println(ex.mul(10,20));
        System.out.println(ex.div(10,10));

    }
}
