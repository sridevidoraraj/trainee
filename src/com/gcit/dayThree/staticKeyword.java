package com.gcit.dayThree;
//static keyword,static variable
public class staticKeyword {
    String name;
    int rollno;
    static String clgname = "abcd";
    staticKeyword(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public void display(){
        System.out.println(" name :" +name+ " rollno : " +rollno+ " clgname :" +clgname);
    }
    public static void main(String args[]){
        staticKeyword s = new staticKeyword("aaa",11);
        staticKeyword s1 = new staticKeyword("rrr",22);
        s.display();
        s1.display();

    }

}
