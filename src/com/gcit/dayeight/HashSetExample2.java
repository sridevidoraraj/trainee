package com.gcit.dayeight;

// HashSet example ignoring duplicate elements

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {
    public static void main(String args[]){
        HashSet<String> hs = new HashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("one");
        hs.add("three");
        hs.add("four");

        System.out.println("entered string : " +hs);
        Iterator<String> iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.println("result : " +iterator.next());
        }
    }
}
