package com.gcit.dayeight;

//Creating an ArrayList and adding new elements to it

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {

    public static void main(String args[]){
        List<String> animal = new ArrayList<>();
        animal.add("lion");
        animal.add("tiger");
        animal.add("elephant");
        animal.add("dog");
        System.out.println("before adding :" +animal);

        animal.add(2,"cat");
        System.out.println("After adding : " +animal);

    }
}
