package com.gcit.dayeight;

//HashSet Example

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();

        hs.add("addition");
        hs.add("subtraction");
        hs.add("multiplication");

        System.out.println("entered string : " +hs);
        Iterator<String> iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.println("result : " +iterator.next());
        }
    }
}
