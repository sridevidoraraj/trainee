package com.gcit.dayeight;

//HashSet example to remove elements

import java.util.HashSet;

public class HashSetExample3 {
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);
        hs.add(21);
        hs.add(31);

        System.out.println("entered element : " +hs);
        hs.remove(12);

        System.out.println("after remove method : " +hs);
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(41);
        hs1.add(51);

        System.out.println("entered another hashset : " +hs1);
        hs.addAll(hs1);
        System.out.println("after adding : " +hs);

        hs.removeAll(hs1);
        System.out.println("after removeall method : " +hs);

        hs.clear();
        System.out.println("after clear method : " +hs);

    }
}
