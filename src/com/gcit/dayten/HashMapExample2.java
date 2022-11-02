package com.gcit.dayten;

//Access HashMap Elements

import java.util.HashMap;

public class HashMapExample2 {

    public static void main(String args[]){

        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");

        System.out.println("added elements : " +hm);

        String value = hm.get(1);

        System.out.println("getting the element : " +value);

        System.out.println("return the keys in the map : " +hm.keySet());

        System.out.println("return the values in the map : " +hm.values());

        System.out.println("returning the full set in the map : " +hm.entrySet());
    }
}
