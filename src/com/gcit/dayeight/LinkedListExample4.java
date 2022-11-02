package com.gcit.dayeight;

//LinkedList Example to reverse a list of elements

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample4 {
    public static void main(String args[]){

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(11);
        ll.add(22);
        ll.add(33);

        System.out.println("entered integer : " +ll );

        Iterator iterator = ll.descendingIterator();
        while(iterator.hasNext()){
            System.out.println("descending iterator : " +iterator.next());
        }
    }
}
