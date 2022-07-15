package com.gcit.dayten;

// Change HashMap Value using replace, replaceall

import java.util.HashMap;

public class HashMapExample3 {

    public static void main(String args[]){
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"ADD");
        hm.put(2,"SUBTRACTION");
        hm.put(3,"MULTIPLICATION");

        System.out.println("original hashmap : " +hm);

        hm.replace(1,"DIVISION");
        System.out.println("after replacing : " +hm);

        hm.replaceAll((k,v) -> "SQUARE");
        System.out.println("replacing all values : " +hm);
    }
}
