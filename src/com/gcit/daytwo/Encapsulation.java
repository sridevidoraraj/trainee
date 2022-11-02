package com.gcit.daytwo;

public class Encapsulation {

    private String studentname;
    private int rollno;
    private int age;

    public String getname(){
        return studentname;
    }
    public int getRollno(){
        return rollno;
    }
    public int getAge(){
        return age;
    }
    public void setname(String sname) {
        studentname = sname;
    }
    public void setRollno(int rno){
        rollno = rno;
    }
    public void setAge(int newage){
        age = newage;
    }
    public static void main(String args[]){
    Encapsulation en = new Encapsulation();
    en.setname("rr");
    en.setRollno(11);
    en.setAge(22);
    System.out.println("name : " +en.getname() + " rollno : " + en.getRollno() + " age : " +en.getAge());
    }




}
