package com.gcit.dayeight;

//Get and Set ArrayList

import java.util.ArrayList;

public class ArrayListExample2 {

    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();

        al.add("addition");
        al.add("subtraction");
        al.add("multiplication");
        System.out.println("getting the element : " +al.get(1));

        al.set(1,"division");
        System.out.println("Setting the element : " +al );
    }
}
