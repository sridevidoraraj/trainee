package com.gcit.dayeight;

// LinkedList example to remove elements

import java.util.LinkedList;

public class LinkedListExample3 {

    public static void main(String args[]){

        LinkedList<String> ll=new LinkedList<String>();
        ll.add("11");
        ll.add("22");
        ll.add("33");
        ll.add("44");
        ll.add("55");
        ll.add("66");
        System.out.println("Initial list of elements: "+ll);

        ll.remove("22");
        System.out.println("After invoking remove method: "+ll);

        ll.remove(0);
        System.out.println("After invoking remove(index) method: "+ll);
        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("77");
        ll2.add("88");

        ll.addAll(ll2);
        System.out.println("Updated list : "+ll);

        ll.removeAll(ll2);
        System.out.println("After invoking removeAll() method: "+ll);

        ll.removeFirst();
        System.out.println("After invoking removeFirst() method: "+ll);

        ll.removeLast();
        System.out.println("After invoking removeLast() method: "+ll);

        ll.clear();
        System.out.println("After invoking clear() method: "+ll);
    }
}
