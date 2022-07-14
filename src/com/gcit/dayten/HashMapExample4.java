package com.gcit.dayten;

//Iterate through a HashMap

import java.util.HashMap;

public class HashMapExample4 {

    public static void main(String args[]){

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("JAVA" , 1);
        hm.put("C" , 2);
        hm.put("PYTHON" , 3);
        hm.put("C++" , 4);

        System.out.println("original hashmap : " +hm);

        //iterate through values

        for(Integer s : hm.values()){
            System.out.println("iterate through values : " +s);
        }
        System.out.println();

        //iterate through keys

        for(String i : hm.keySet()){
            System.out.println("iterate through key : " +i);
        }
    }
}
