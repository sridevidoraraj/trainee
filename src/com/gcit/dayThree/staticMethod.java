package com.gcit.dayThree;
//static method
public class staticMethod {
    String name;
    int rollno;
    static String clgname = "abcd";
    static void change(){
        clgname = " efgh";
    }
    staticMethod(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public void display(){
        System.out.println(" name :" +name+ " rollno : " +rollno+ " clgname :" +clgname);
    }
    public static void main(String args[]){
        staticMethod.change();
        staticMethod s = new staticMethod("aaa",11);
        staticMethod s1 = new staticMethod("rrr",22);
        s.display();
        s1.display();

    }

}
