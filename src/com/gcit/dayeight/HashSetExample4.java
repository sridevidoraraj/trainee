package com.gcit.dayeight;

//HashSet from another Collection

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample4 {

    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();

        al.add(100);
        al.add(200);
        al.add(300);
        System.out.println("elements in arraylist : " +al);

        HashSet<Integer> hs = new HashSet(al);
        hs.add(400);
        hs.add(500);
        System.out.println("elements in hashset : " +hs);

        Iterator<Integer> iterator = hs.iterator();
        while(iterator.hasNext()){
            System.out.println("combined collections : " +iterator.next());
        }
    }
}
