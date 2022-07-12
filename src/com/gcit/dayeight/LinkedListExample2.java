package com.gcit.dayeight;

//LinkedList example to add elements

import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String args[]){
        LinkedList<String> ll=new LinkedList<String>();
        System.out.println("Initial list of elements: "+ll);
        ll.add("11");
        ll.add("22");
        ll.add("33");
        System.out.println("After invoking add method: "+ll);

        ll.add(1, "44");
        System.out.println("After invoking add method: "+ll);
        LinkedList<String> ll2=new LinkedList<String>();
        ll2.add("55");
        ll2.add("66");

        ll.addAll(ll2);
        System.out.println("After invoking addAll method: "+ll);
        LinkedList<String> ll3=new LinkedList<String>();
        ll3.add("77");
        ll3.add("88");

        ll.addAll(1, ll3);
        System.out.println("After invoking addAll method: "+ll);

        ll.addFirst("99");
        System.out.println("After invoking addFirst method: "+ll);

        ll.addLast("100");
        System.out.println("After invoking addLast method: "+ll);
    }
}
