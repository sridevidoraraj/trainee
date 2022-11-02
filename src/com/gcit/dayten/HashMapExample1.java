package com.gcit.dayten;

//1. Add elements to a HashMap using put,putall,putifabsent

import java.util.HashMap;

public class HashMapExample1 {

    public static void main(String args[]){


        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1,"java");
        hm.put(2,"c");
        hm.put(3,"python");

        System.out.println("added key and value are : " +hm);

        HashMap<Integer,String> hm1 = new HashMap<>();
        hm1.put(4,".net");
        hm1.put(5,"c++");

        System.out.println("added key and value on another hashmap : " +hm1);

        hm1.putAll(hm);

        System.out.println("result : " +hm1);

        hm1.putIfAbsent(6,"testing");

        System.out.println("Added new key and value : " +hm1);
    }
}
