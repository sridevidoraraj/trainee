package com.gcit.daythree;
//static keyword,static variable
public class StaticKeyword {

    String name;
    int rollno;
    static String clgname = "abcd";
    StaticKeyword(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public void display(){
        System.out.println(" name :" +name+ " rollno : " +rollno+ " clgname :" +clgname);
    }
    public static void main(String args[]){
        StaticKeyword s = new StaticKeyword("aaa",11);
        StaticKeyword s1 = new StaticKeyword("rrr",22);
        s.display();
        s1.display();

    }

}
