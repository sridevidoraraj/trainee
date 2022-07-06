package com.gcit.dayThree;
//static method
public class StaticMethod {
    String name;
    int rollno;
    static String clgname = "abcd";
    static void change(){
        clgname = " efgh";
    }
    StaticMethod(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    public void display(){
        System.out.println(" name :" +name+ " rollno : " +rollno+ " clgname :" +clgname);
    }
    public static void main(String args[]){
        StaticMethod.change();
        StaticMethod s = new StaticMethod("aaa",11);
        StaticMethod s1 = new StaticMethod("rrr",22);
        s.display();
        s1.display();

    }

}
